package com.sensetime.springtest;

/**
 * Created by Hunt on 9/1/15.
 */
public class Greeting {
    private final String greeting;

    public Greeting(String name) {
        this.greeting = "Hello " + name + "!";
    }

    public String getGreeting() {
        return greeting;
    }
}
