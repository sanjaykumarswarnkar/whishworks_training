package com.mulesoft.training;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mule.tck.junit4.FunctionalTestCase;

public class HelloMavenTest extends FunctionalTestCase {

    @Test
    public void mavenFlowReturnsHelloMaven() throws Exception {
        runFlowAndExpect("maven-demo-projectFlow", "#Hello World");
    }
    
    @Override
    protected String getConfigFile() {
        return "maven-demo-project.xml";
    }

}
