package com.bodavivi.connectionwithsql;

import com.bodavivi.connectionwithsql.models.Assignee;
import com.bodavivi.connectionwithsql.models.Todo;
import com.bodavivi.connectionwithsql.repositories.AssigneeRepo;
import com.bodavivi.connectionwithsql.repositories.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConnectionwithsqlApplication implements CommandLineRunner {
  private AssigneeRepo assigneeRepo;
  private TodoRepo todoRepo;

  @Autowired
  public ConnectionwithsqlApplication (AssigneeRepo assigneeRepo, TodoRepo todoRepo){
    this.assigneeRepo=assigneeRepo;
    this.todoRepo=todoRepo;
  }

  public static void main(String[] args) {
    SpringApplication.run(ConnectionwithsqlApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    Assignee Marci = new Assignee("Marci", "marci@greenfox.com");
    Todo mandarin = new Todo("Eat mandarin", true, false);

    Marci.addTodo(mandarin);
    assigneeRepo.save(Marci);
  }
}
