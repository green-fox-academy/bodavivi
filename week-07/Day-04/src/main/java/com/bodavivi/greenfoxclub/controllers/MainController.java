package com.bodavivi.greenfoxclub.controllers;

import com.bodavivi.greenfoxclub.models.Fox;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {
  List<Fox> foxes = new ArrayList<>();

  @GetMapping(value = {"", "/"})
  public String index(Model model, @RequestParam (name = "name", required = false) String name) {
    Fox actualfox = new Fox("anonymus", "kavics", "viz");

    for(Fox fox : foxes){
      if (fox.getName().equals(name)){
       actualfox = fox;
      }
    }

    if (name == null){
      return "login";
    }else {
      model.addAttribute("name", actualfox.getName());
      model.addAttribute("food", actualfox.getFood());
      model.addAttribute("drink", actualfox.getDrink());
      model.addAttribute("tricks", actualfox.getTricks().size());
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

  @GetMapping(value ={"/create"})
  public String createForm(@ModelAttribute("fox") Fox fox) {
    return "create";
  }

  @PostMapping(value = {"/create"})
  public String createFox(@ModelAttribute("fox") Fox fox){
    foxes.add(fox);
    return "redirect:/?name=" + fox.getName();
  }
}
