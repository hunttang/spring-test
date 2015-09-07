package com.sensetime.springtest;

import org.springframework.web.bind.annotation.*;

/**
 * Created by Hunt on 9/1/15.
 */
@RestController
public class GreetingController {
    @RequestMapping(method = RequestMethod.GET, value = "/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(name);
    }
}
