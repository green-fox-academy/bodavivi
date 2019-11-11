package com.bodavivi.greenfoxclub.controllers;
import com.bodavivi.greenfoxclub.services.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class TrickController {
  @Autowired
  MainService mainService;


  @GetMapping(value = "/trickcenter")
  public String learnTrick(@RequestParam String name, Model model){
    List<String> learnables = mainService.getTrickLibrary().stream().filter(
       trick ->  !mainService.findFox(name).getTricks().contains(trick)
    ).collect(Collectors.toList());

    model.addAttribute("learnables", learnables);
    model.addAttribute("name", name);
    return "trickcenter";
  }

  @PostMapping(value = "/trickcenter")
  public String learnTrick(@RequestParam String name, @RequestParam String trickToLearn){
    mainService.findFox(name).learnTrick(trickToLearn);
    return "redirect:/?name=" + name;
  }
}
