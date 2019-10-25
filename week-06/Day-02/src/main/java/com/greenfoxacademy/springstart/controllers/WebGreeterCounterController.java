package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.models.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class WebGreeterCounterController {
  AtomicLong counter = new AtomicLong();
  @RequestMapping(value = "/web/greeting2")
  @ResponseBody
  public String greetCounter(@RequestParam String name){
    counter.getAndAdd(1);
    return "Hello, " + name + "! This site was loaded " + counter + " times since last server start.";
  }
}
