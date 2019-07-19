package com.log4j1;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class LogLevelExample {
    private static Logger logger = Logger.getLogger(LogLevelExample.class);

    public static void main(String[] args) {
        logger.setLevel(Level.INFO);

        logger.trace("Trace Message!");
        logger.debug("Debug Message!");
        logger.info("Info Message!");
        logger.warn("Warn Message!");
        logger.error("Error Message!");
        logger.fatal("Fatal Message!");
    }
}
