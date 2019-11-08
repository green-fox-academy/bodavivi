package com.bodavivi.reddit.controllers;
import com.bodavivi.reddit.models.Post;
import com.bodavivi.reddit.repositories.PostRepo;
import com.bodavivi.reddit.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PostController {
  @Autowired
  PostService postService;

  @GetMapping(value = {"/", "/posts"})
  public String posts (Model model){
    model.addAttribute("posts", postService.listByRating());
    return "index";
  }

  @GetMapping(value = "{id}/ratingup")
  public String ratingUp(@PathVariable(name="id") Long id){
   postService.ratingUp(id);
    return "redirect:/";
  }

  @GetMapping(value = "{id}/ratingdown")
  public String ratingdown(@PathVariable(name="id") Long id){
   postService.ratingDown(id);
    return "redirect:/";
  }

  @GetMapping(value = "/submit")
  public String submit(@ModelAttribute(name = "newpost") Post post){
    return "submit";
  }

  @PostMapping(value = "/submit")
  public String submitAdd(@ModelAttribute Post post){
    postService.savePost(post);
    return "redirect:/";
  }

}
