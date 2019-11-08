package com.bodavivi.reddit.services;


import com.bodavivi.reddit.models.Post;

import java.util.List;

public interface PostService {
  Post findById(Long id);
  List<Post> listByRating();
  void ratingUp(Long id);
  void ratingDown(Long id);
  void savePost(Post post);
}
