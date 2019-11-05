package com.bodavivi.connectionwithsql.controllers;
import com.bodavivi.connectionwithsql.repositories.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = "/todo")
@Controller
public class TodoController {

  @Autowired
  TodoRepo repo;

  @GetMapping(value = {"/", "/list"})
  public String list(Model model){
    model.addAttribute("todos", repo.findAll());
    return "todolist";
  }
}
