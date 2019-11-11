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
    Post post = new Post("1blog", "http://greyandbrunette.wordpress.com");
    Post post2 = new Post("2spotify", "http://play.spotify.com");
    Post post3 = new Post("3uTube", "http://youtube.com");
    Post post4 = new Post("4instagram", "http://instagram.com");
    Post post5 = new Post("5blog", "http://greyandbrunette.wordpress.com");
    Post post6 = new Post("6spotify", "http://play.spotify.com");
    Post post7 = new Post("7uTube", "http://youtube.com");
    Post post8 = new Post("8instagram", "http://instagram.com");
    Post post9 = new Post("9blog", "http://greyandbrunette.wordpress.com");
    Post post10 = new Post("10spotify", "http://play.spotify.com");
    Post post11 = new Post("11uTube", "http://youtube.com");
    Post post12 = new Post("12instagram", "http://instagram.com");
    Post post24 = new Post("13blog", "http://greyandbrunette.wordpress.com");
    Post post13 = new Post("14spotify", "http://play.spotify.com");
    Post post14 = new Post("15uTube", "http://youtube.com");
    Post post15 = new Post("16instagram", "http://instagram.com");
    Post post16 = new Post("17blog", "http://greyandbrunette.wordpress.com");
    Post post17 = new Post("18spotify", "http://play.spotify.com");
    Post post23 = new Post("19uTube", "http://youtube.com");
    Post post18 = new Post("20instagram", "http://instagram.com");
    Post post19 = new Post("21blog", "http://greyandbrunette.wordpress.com");
    Post post20 = new Post("22spotify", "http://play.spotify.com");
    Post post21 = new Post("23uTube", "http://youtube.com");
    Post post22 = new Post("24instagram", "http://instagram.com");
    postRepo.save(post);
    postRepo.save(post2);
    postRepo.save(post3);
    postRepo.save(post4);
    postRepo.save(post5);
    postRepo.save(post6);
    postRepo.save(post7);
    postRepo.save(post8);
    postRepo.save(post9);
    postRepo.save(post10);
    postRepo.save(post11);
    postRepo.save(post12);
    postRepo.save(post13);
    postRepo.save(post23);
    postRepo.save(post24);
    postRepo.save(post14);
    postRepo.save(post15);
    postRepo.save(post16);
    postRepo.save(post17);
    postRepo.save(post18);
    postRepo.save(post19);
    postRepo.save(post20);
    postRepo.save(post21);
    postRepo.save(post22);
  }
}
