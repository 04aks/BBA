package sbah.app;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame window = new JFrame("BBA");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);

        GamePanel gamePanel = new GamePanel();
        window.add(gamePanel);
        gamePanel.startGameThread();

        window.pack();

        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
}