package com.bodavivi.reddit.controllers;

import com.bodavivi.reddit.models.Post;
import com.bodavivi.reddit.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PostController {
  @Autowired
  PostService postService;

  @GetMapping(value = {"/", "/posts"})
  public String posts(Model model, @RequestParam(name = "page", required = false) Integer page) {
    List<Post> listToGive = new ArrayList<>();
    if ((page == null || page == 0 || page == 1) && postService.listByRating().size() >= 10) {
      for (int i = 0; i < 10; i++) {
        listToGive.add(postService.listByRating().get(i));
      }
    } else if (page == null || page == 0 || page == 1) {
      listToGive = postService.listByRating();
    } else {
      if (page * 10 > postService.listByRating().size()) {
        for (int i = ((page) * 10); i < postService.listByRating().size(); i++) {
          listToGive.add(postService.listByRating().get(i));
        }
      } else {
        for (int i = ((page) * 10); i < (page*10) + 10; i++) {
          listToGive.add(postService.listByRating().get(i));
        }
      }
    }
    model.addAttribute("posts", listToGive);
    return "index";
  }

  @GetMapping(value = "{id}/ratingup")
  public String ratingUp(@PathVariable(name = "id") Long id) {
    postService.ratingUp(id);
    return "redirect:/";
  }

  @GetMapping(value = "{id}/ratingdown")
  public String ratingdown(@PathVariable(name = "id") Long id) {
    postService.ratingDown(id);
    return "redirect:/";
  }

  @GetMapping(value = "/submit")
  public String submit(@ModelAttribute(name = "newpost") Post post) {
    return "submit";
  }

  @PostMapping(value = "/submit")
  public String submitAdd(@ModelAttribute Post post) {
    postService.savePost(post);
    return "redirect:/";
  }

}
