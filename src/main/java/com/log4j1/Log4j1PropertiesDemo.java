package com.log4j1;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log4j1PropertiesDemo {

    static Logger logger = Logger.getLogger(Log4j1PropertiesDemo.class);

    /**
     * 加载配置文件
     * 打印Log
     *
     * @param args
     */
    public static void main(String[] args) {
        PropertyConfigurator.configure("src/main/resources/log4j.properties");
        logger.debug("Log4j Properties Configuration !!");
    }
}
