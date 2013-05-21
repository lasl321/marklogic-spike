package com.example.spikes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloFromJava {
    private static final Logger LOG = LoggerFactory.getLogger(HelloFromJava.class);

    public String doSomething() {
        LOG.debug("I am {} something!", "doing");
        return "I am doing something";
    }
}
