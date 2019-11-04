package com.bodavivi.greenfoxclub.controllers;

import com.bodavivi.greenfoxclub.models.Fox;
import com.bodavivi.greenfoxclub.services.MainService;
import com.bodavivi.greenfoxclub.services.MainServiceImpl;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  @Autowired
  private MainService mainService;

  @GetMapping(value = {"", "/"})
  public String index(Model model, @RequestParam(name = "name", required = false) String name) {
    Fox actualfox = mainService.findFox(name);

    if (actualfox.getName()== null) {
      return "login";
    } else {
      model.addAttribute("fox", actualfox);
      model.addAttribute("tricks", actualfox.getTricks().size());
      return "index";
    }
  }

  @GetMapping(value = {"/login"})
  public String logIn() {
    return "login";
  }

  @PostMapping(value = {"/login"})
  public String logIn(@RequestParam String name) {
    return "redirect:/?name=" + name;
  }

  @GetMapping(value = {"/create"})
  public String createForm(@ModelAttribute("fox") Fox fox) {
    return "create";
  }

  @PostMapping(value = {"/create"})
  public String createFox(@ModelAttribute("fox") Fox fox) {
    if (mainService.alreadyExist(fox)) {
      return "redirect:/create";
    } else {
      mainService.addFox(fox);
      return "redirect:/?name=" + fox.getName();
    }
  }

  @GetMapping(value = "/nutritionstore")
  public String nutritionGet(@RequestParam String name, Model model){
    model.addAttribute("name", name);
    return "nutrition";
  }

  @PostMapping(value = "/nutritionstore")
  public String nutrition(@RequestParam String name, @RequestParam String drink, @RequestParam String food){
   mainService.findFox(name).setDrink(drink);
   mainService.findFox(name).setFood(food);
   return "redirect:/?name=" + name;
  }
}
