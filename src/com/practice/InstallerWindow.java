package com.practice;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class InstallerWindow extends Frame {

    static void initialize(String title, Dimension dimension,
                           boolean exitOnClose) {
        var window = new InstallerWindow();

        window.setTitle(title);
        window.setSize(dimension);
        window.setVisible(true);

        if (exitOnClose)
            window.addWindowListener(
                    new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent e) {
                        System.exit(0);
                    }
                }
            );
    }
}
