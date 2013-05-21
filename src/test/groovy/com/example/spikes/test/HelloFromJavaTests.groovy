package com.example.spikes.test

import com.example.spikes.HelloFromJava
import org.junit.Test
import org.slf4j.Logger
import org.slf4j.LoggerFactory;

class HelloFromJavaTests {
    private static final Logger LOG = LoggerFactory.getLogger(HelloFromJavaTests)

    @Test
    void shouldDoSomething() {
        LOG.debug('should do something in this test')
        HelloFromJava instance = new HelloFromJava()
        assert instance.doSomething()
    }
}
