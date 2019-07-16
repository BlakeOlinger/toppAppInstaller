package com.practice;

/*
TOPP App Installer Microservice

Download and install TOPP App from -
  https://github.com/BlakeOlinger/staggingTOPPAppProgramFiles/blob/master/programFiles/install/toppAppInstaller.zip

  - extract and run /bin/toppAppInstaller.bat

  - add project config and git directories to customjre before ship
 */

// TODO - strip current installation functionality from
//  - toppAppMaster
//  add in .../root install dir/config/<microservices>/ config files
//  - prompt user - install directory - default: ".../program files/TOPP App"
//  -- do from downloads to test
//  - check connection
//  - create install directories
//  - change working directory to program file directory
//  - add git binaries to this project directory bat files
//  - perform git commands by performing them in the current directory
//  -- the one with git files in with MS
//  - check for valid git config and prompt user for credentials if not
//  - save to file in program file directory
//  - and change working directory by appending the various pull/push
//  - have a checkbox that allows the user to install a develop sandbox version
//  - this will be the only option in the beginning
//  - dev sandbox install will use the stagingProgramFiles and testDatabase instead of live

// - Git won't be standalone within the microservices to start - have client download and install Git for now

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
