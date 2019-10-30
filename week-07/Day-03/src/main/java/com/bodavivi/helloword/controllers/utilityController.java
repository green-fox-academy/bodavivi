package com.bodavivi.helloword.controllers;

import com.bodavivi.helloword.services.UtilityService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class utilityController {

  UtilityService utility;

  public utilityController(UtilityService utility){
    this.utility = utility;
  }


  @GetMapping(value = "/useful")
  public String links(){
    return "utility";
  }

  @GetMapping(value = "/useful/colored")
  public String colorBackground(Model model){
    model.addAttribute("color", utility.randomColor());
    return "background";
  }

  @PostMapping(value = "/email")
  public String emailCheck(@RequestParam String email, Model model){
    model.addAttribute("email", email);

    char emailToChars [] = email.toCharArray();
    boolean at = false;
    boolean dot = false;
    boolean acceptable = false;
    for (char character : emailToChars) {
      if (character == '@'){
        at = true;
      }else if(character == '.'){
        dot = true;
      }
    }

    if (at && dot){
      acceptable = true;
    }

    model.addAttribute("acceptable", acceptable);
    return "email";
  }

  @PostMapping(value ="/caesar")
  public String caesarEncoder(@RequestParam String toEncrypt, @RequestParam int numberToEncrypt, Model model){
    model.addAttribute("toCrypt", utility.caesar(toEncrypt, numberToEncrypt));
    return "caesar";
  }

  @PostMapping(value ="/caesarDecrypt")
  public String caesarDecoder(@RequestParam String toDecrypt, @RequestParam int numberToDecrypt, Model model){
    model.addAttribute("toCrypt", utility.caesar(toDecrypt, (numberToDecrypt* (-1))));
    return "caesar";
  }


}
