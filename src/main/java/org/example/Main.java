package org.example;

import javax.swing.*;

public class Main {
    static void main() {
        //SwingUtilities.invokeLater(() -> new DateTimeApp().setVisible(true));
       // SwingUtilities.invokeLater(() -> new Banner().setVisible(true));
        SwingUtilities.invokeLater(Circle::new);

    }
}
