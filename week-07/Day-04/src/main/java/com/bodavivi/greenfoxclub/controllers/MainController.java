package com.bodavivi.greenfoxclub.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  @GetMapping(value = {"", "/"})
  public String index(Model model, @RequestParam (name = "name", required = false) String name) {
    if (name == null){
      return "login";
    }else {
      model.addAttribute("name", name);
      return "index";
    }
  }

  @GetMapping(value = {"/login"})
  public String logIn(){
    return "login";
  }
  @PostMapping(value = {"/login"})
  public String logIn(@RequestParam String name) {
    return "redirect:/?name=" + name;
  }
}
