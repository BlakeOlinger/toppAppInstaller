package com.practice;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.logging.Level;
import java.util.logging.Logger;

class InstallerWindow extends Frame implements Runnable{
    private static final Logger logger =
            Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    private final Thread thread;

    private InstallerWindow() {
        thread = new Thread(this, "Installer Window");
    }

    private static InstallerWindow initialize(String title, Dimension dimension) {
        var window = new InstallerWindow();

        window.setTitle(title);
        window.setSize(dimension);
        window.setVisible(true);
        window.addWindowListener(
                new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent e) {
                        System.exit(0);
                    }
                }
        );

        return window;
    }

    @Override
    public void run() {
        logger.log(Level.INFO, "Installer Window GUI Thread - Start");

        var installWindow = initialize();

        logger.log(Level.INFO, "Installer Window GUI Thread - Exit");
    }
}
