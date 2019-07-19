package com.log4j1;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class Log4j1XmlDemo {
    static Logger logger = Logger.getLogger(Log4j1XmlDemo.class);

    /**
     * 加载配置文件
     * 打印Log
     * @param args
     */
    public static void main(String[] args) {

        DOMConfigurator.configure("src/main/resources/log4j.xml");
        logger.debug("Log4j Xml Configuration !!");
    }
}
