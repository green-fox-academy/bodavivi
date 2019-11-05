package com.bodavivi.listingtodos;

import com.bodavivi.listingtodos.models.Todo;
import com.bodavivi.listingtodos.repositories.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ListingtodosApplication implements CommandLineRunner {
  @Autowired
  TodoRepo repo;

  public static void main(String[] args) {
    SpringApplication.run(ListingtodosApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    repo.save(new Todo("Learn new things"));
    repo.save(new Todo("Walk the dog"));
  }
}
