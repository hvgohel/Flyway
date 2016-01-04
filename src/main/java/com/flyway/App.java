package com.flyway;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App
{
    private static Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args)
    {
        SpringApplication.run(App.class, args);

        logger.debug("main() :: hello debug");
        logger.trace("main() :: hello trace");
        logger.warn("main() :: hello warn");
    }

}
