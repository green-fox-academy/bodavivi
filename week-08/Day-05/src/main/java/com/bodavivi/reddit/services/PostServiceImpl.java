package com.bodavivi.reddit.services;

import com.bodavivi.reddit.models.Post;
import com.bodavivi.reddit.repositories.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {
  @Autowired
  PostRepo postRepo;

  @Override
  public Post findById(Long id){
    return postRepo.findById(id).orElse(null);
  }

  @Override
  public List<Post> listByRating(){
    return postRepo.sortPostsByRating();
  }

  @Override
  public void ratingUp(Long id){
    postRepo.findById(id).get().setRating(postRepo.findById(id).get().getRating() + 1);
    postRepo.save(postRepo.findById(id).orElse(null));
  }

  @Override
  public void ratingDown(Long id){
    postRepo.findById(id).get().setRating(postRepo.findById(id).get().getRating() - 1);
    postRepo.save(postRepo.findById(id).orElse(null));
  }

  @Override
  public void savePost(Post post){
    postRepo.save(post);
  }
}
