package org.example;

import javax.swing.*;
import java.awt.*;

public class Banner extends JFrame {

    private final JLabel bannerLabel;
    private int x;

    public Banner() {
        super("Banner Application");

        setLayout(null);

        bannerLabel = new JLabel("Java World");
        bannerLabel.setFont(new Font("Arial", Font.BOLD, 28));

        add(bannerLabel);

        setSize(600, 350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        x = getWidth();
        bannerLabel.setBounds(x, 150, 200, 40);

        startMarquee();
    }

    private void startMarquee() {
        Timer timer = new Timer(10, e -> {
            x--;
            bannerLabel.setLocation(x, 150);

            if (x + bannerLabel.getWidth() < 0) {
                x = getWidth();
            }
        });

        timer.start();
    }


}