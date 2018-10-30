package com.java.tomtomproject.spring.restController;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.*;//questMapping;
import org.springframework.web.bind.annotation.*;//RequestParam;
import org.springframework.web.bind.annotation.*;//RestController;

public class MainController {

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/Test")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }
}
