package com.bodavivi.bankofsimba.controllers;

import com.bodavivi.bankofsimba.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class bankController {
  List<BankAccount> accounts = new ArrayList<>();

  public bankController(){
    accounts.add(new BankAccount("Simba", 2000, "lion", true, true));
    accounts.add(new BankAccount("Nala", 3000, "lion", true));
    accounts.add(new BankAccount("Rafiki", 5000, "baboon", true));
    accounts.add(new BankAccount("Timon", 500, "meerkat", true));
    accounts.add(new BankAccount("Pumba", 500, "warthog",true));
    accounts.add(new BankAccount("Ed", -400, "hyena", false));
  }

  @GetMapping(value = "/show")
  public String showAccounts(Model model){
    model.addAttribute("accounts", accounts);
    return "show";
  }

  @GetMapping(value = "/text")
  public String textTry(Model model){
    model.addAttribute("text", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
    return "text";
  }

  @PostMapping(value ="/raise")
  public String raise(Model model, @RequestParam int animalIndex){
    if(accounts.get(animalIndex).isKing()){
      accounts.get(animalIndex).setBalance(accounts.get(animalIndex).getBalance() + 100);
    }else{
      accounts.get(animalIndex).setBalance(accounts.get(animalIndex).getBalance() + 10);
    }
    return "redirect:/show";
  }
}
