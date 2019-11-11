package com.bodavivi.greenfoxclub.controllers;

import com.bodavivi.greenfoxclub.services.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FoxController {
  @Autowired
  private MainService mainService;

  @GetMapping(value = "/nutritionstore")
  public String nutritionGet(@RequestParam String name, Model model) {
    model.addAttribute("name", name);
    return "nutrition";
  }

  @PostMapping(value = "/nutritionstore")
  public String nutrition(@RequestParam String name, @RequestParam String drink, @RequestParam String food) {
    mainService.findFox(name).setDrink(drink);
    mainService.findFox(name).setFood(food);
    return "redirect:/?name=" + name;
  }


}
