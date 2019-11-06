package com.bodavivi.connectionwithsql.controllers;

import com.bodavivi.connectionwithsql.models.Todo;
import com.bodavivi.connectionwithsql.repositories.TodoRepo;
import com.bodavivi.connectionwithsql.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RequestMapping(value = "/todo")
@Controller
public class TodoController {

  @Autowired
  TodoRepo repo;

  @Autowired
  TodoService todoService;

  @GetMapping(value = {"/", "/list"})
  public String list(Model model, @RequestParam(required = false) Boolean isActive) {
    if (isActive == null) {
      model.addAttribute("todos", repo.findAll());
    } else {
      model.addAttribute("todos", todoService.list(isActive));
    }
    return "todolist";
  }

  @GetMapping(value = "/add")
  public String addGet(@ModelAttribute(name = "todo") Todo todo) {
    return "add";
  }

  @PostMapping(value = "/add")
  public String add(@ModelAttribute Todo todo) {
    repo.save(todo);
    return "redirect:/todo/";
  }


  @GetMapping(value = "/{id}/delete")
  public String delete(@PathVariable long id) {
    repo.deleteById(id);
    return "redirect:/todo/";
  }

  @GetMapping(value = "/{id}/edit")
  public String update(@PathVariable long id, Model model) {
    model.addAttribute("todo", todoService.findById(id));
    return "edit";
  }

  @PostMapping(value = "/{id}/edit")
  public String update(@ModelAttribute(name = "todo") Todo todo) {
    repo.save(todo);
    return "redirect:/todo/";
  }

  @PostMapping(value = "/search")
  public String search(@RequestParam(name = "search") String search, Model model) {
    model.addAttribute("todos", todoService.searched(search));
    return "todolist";
  }

  @GetMapping(value = "/assignee")
  public String assign(){
    return "assign";
  }
}
