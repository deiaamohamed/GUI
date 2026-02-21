package org.example;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Circle extends JFrame {

    public Circle() {

        setTitle("Moving Ball Application");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        add(new BallPanel());

        setVisible(true);
    }

    class BallPanel extends JPanel {

        private int x = 100;
        private int y = 100;
        private final int radius = 30;

        private int dx = 3;
        private int dy = 3;

        private final Random random = new Random();

        public BallPanel() {

            Timer timer = new Timer(10, e -> moveBall());
            timer.start();
        }

        private void moveBall() {

            x += dx;
            y += dy;

            if (x <= 0 || x + radius >= getWidth()) {
                dx = -dx;
            }

            if (y <= 0 || y + radius >= getHeight()) {
                dy = -dy;
            }

            if (random.nextInt(100) < 2) {
                dx += random.nextInt(3) - 1;
                dy += random.nextInt(3) - 1;
            }

            repaint();
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            g.setColor(Color.BLUE);
            g.fillOval(x, y, radius, radius);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Circle::new);
    }
}