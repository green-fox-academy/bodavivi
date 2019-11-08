package com.bodavivi.reddit.repositories;

import com.bodavivi.reddit.models.Post;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PostRepo extends CrudRepository<Post, Long> {
  @Query(value = "select * FROM post p ORDER BY p.rating Desc", nativeQuery = true)
  List<Post> sortPostsByRating();
}
