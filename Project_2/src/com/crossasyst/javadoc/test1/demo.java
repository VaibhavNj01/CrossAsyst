package com.crossasyst.javadoc.test1;

import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j2;

import java.util.logging.LogManager;
import java.util.logging.Logger;

@Log4j2
public class demo {
   // public static final Logger LOG= LogManager.getLogger(demo.class);

    public static void main(String[] args) {
        person  p= new person();
        p.setFirstName("Hello");

        log.info(p.getFirstName());



    }
}
