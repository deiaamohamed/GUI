package org.example;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeApp extends JFrame {

    private final JLabel timeLabel;
    private final SimpleDateFormat formatter = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy");

    public DateTimeApp() {
        super("Time & Date Application Thread");

        timeLabel = new JLabel("", SwingConstants.CENTER);
        timeLabel.setFont(new Font("Arial", Font.PLAIN, 18));

        setLayout(new BorderLayout());
        add(timeLabel, BorderLayout.CENTER);

        setSize(600, 350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        startClock();
    }

    private void startClock() {
        Timer timer = new Timer(1000, e -> {
            String now = formatter.format(new Date());
            timeLabel.setText(now);
        });
        timer.setInitialDelay(0);
        timer.start();
    }


}