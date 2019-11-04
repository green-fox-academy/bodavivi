package com.bodavivi.greenfoxclub.controllers;

import com.bodavivi.greenfoxclub.services.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class FoxController {
  @Autowired
  MainService mainService;

}
