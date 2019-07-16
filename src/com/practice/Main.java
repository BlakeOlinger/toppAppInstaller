package com.practice;

/*
TOPP App Installer Microservice
 */

// TODO - strip current installation functionality from
//  - toppAppMaster
//  add in .../root install dir/config/<microservices>/ config files

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static final Logger logger =
            Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    public static void main(String[] args) {
        logger.log(Level.INFO, "Main Thread - Start");


        logger.log(Level.INFO, "Main Thread - Exit");
    }
}
