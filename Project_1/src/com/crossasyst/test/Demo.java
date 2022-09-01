package com.crossasyst.test;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import java.lang.annotation.Target;

public class Demo {

    public static final Logger LOG= LogManager.getLogger(Demo.class) ;


    public static void main(String[] args) {
        LOG.info("heyyy world");

    }


}
