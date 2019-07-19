package com.log4j1;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Log4j1BaseDemo {
    static final Logger logger = Logger.getLogger(Log4j1BaseDemo.class);

    /**
     * 加载默认配置文件
     *
     * @param args
     */
    public static void main(String[] args) {
        BasicConfigurator.configure();
        logger.debug("Log4j Base Configuration !!");
    }
}
