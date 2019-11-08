package com.bodavivi.reddit;

import com.bodavivi.reddit.models.Post;
import com.bodavivi.reddit.repositories.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RedditApplication implements CommandLineRunner {

  @Autowired
  PostRepo postRepo;

  @Autowired
  public RedditApplication(PostRepo postRepo) {
    this.postRepo = postRepo;
  }

  public static void main(String[] args) {
    SpringApplication.run(RedditApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    Post post = new Post("blog", "http://greyandbrunette.wordpress.com");
    Post post2 = new Post("spotify", "http://play.spotify.com");
    Post post3 = new Post("uTube", "http://youtube.com");
    Post post4 = new Post("instagram", "http://instagram.com");
    postRepo.save(post);
    postRepo.save(post2);
    postRepo.save(post3);
    postRepo.save(post4);
  }
}
