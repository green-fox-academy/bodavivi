package com.greenfoxacademy.springstart.controllers;
import com.greenfoxacademy.springstart.models.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {

  AtomicLong counter = new AtomicLong();

  @RequestMapping(value = "/greeting")
  @ResponseBody
  public Greeting greeting(@RequestParam String name){
    counter.addAndGet(1);
    Greeting greeting = new Greeting(counter, "Hello, " + name);
    return greeting;
  }
}
