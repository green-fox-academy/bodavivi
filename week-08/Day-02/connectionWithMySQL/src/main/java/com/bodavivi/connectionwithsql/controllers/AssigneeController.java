package com.bodavivi.connectionwithsql.controllers;
import com.bodavivi.connectionwithsql.models.Assignee;
import com.bodavivi.connectionwithsql.repositories.AssigneeRepo;
import com.bodavivi.connectionwithsql.repositories.TodoRepo;
import com.bodavivi.connectionwithsql.services.AssigneeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.stream.Collectors;

@RequestMapping(value = "/todo")
@Controller
public class AssigneeController {
  @Autowired
  AssigneeService assigneeService;
  @Autowired
  AssigneeRepo assigneeRepo;
  @Autowired
  TodoRepo todoRepo;

  @GetMapping(value = "/assignee")
  public String assign(Model model){
    model.addAttribute("assigneeList", assigneeRepo.findAll());
    return "assign";
  }

  @PostMapping(value = "/assignee")
  public String assignList(Model model, @RequestParam(name = "name") String name, @RequestParam(name="email") String email){
    assigneeRepo.save(new Assignee(name, email));
    model.addAttribute("assigneeList", assigneeRepo.findAll());
    return "assign";
  }

  @GetMapping(value = "/{id}/editassignee")
  public String editAssignee(@PathVariable long id, Model model){
    model.addAttribute("assignee", assigneeService.findById(id));
    return "editassignee";
  }

  @PostMapping(value = "/{id}/editassignee")
  public String editAssignee(@ModelAttribute Assignee assignee){
    assigneeRepo.save(assignee);
    return "redirect:/todo/assignee";
  }

  @GetMapping(value = "/{id}/deleteassignee")
  public String deleteAssignee(@PathVariable Long id){
    assigneeRepo.findById(id).get().getTodos().stream().forEach(todo -> todo.setAssignee(null));
    assigneeRepo.deleteById(id);
    return "redirect:/todo/assignee";
  }

 @GetMapping(value = "/{id}/assigneestodos")
  public String assigneesTodos(@PathVariable Long id, Model model){
   model.addAttribute("todos", assigneeRepo.findById(id).get().getTodos().stream().collect(Collectors.toList()));
   return "todolist";
  }
}
