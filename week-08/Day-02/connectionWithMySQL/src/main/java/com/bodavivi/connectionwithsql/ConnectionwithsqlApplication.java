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
    Assignee vivi = new Assignee("Vivi", "vivi@greenfox.com");
    Todo appla = new Todo("Eat appla", true, false);

    vivi.addTodo(appla);
    assigneeRepo.save(vivi);

    Assignee valen = new Assignee("Valen", "valen@greenfox.com");
    Todo banana = new Todo("Eat banana ", false, true);

    Todo coconat = new Todo("Drink coconut water", true, false);

    valen.addTodo(banana);
    valen.addTodo(coconat);

    assigneeRepo.save(valen);

    Assignee barna = new Assignee("Barna", "sth@sth.com");
    Todo sth = new Todo("do sth", true, false);

    barna.addTodo(sth);
    assigneeRepo.save(barna);
    System.out.println(vivi.getTodos().toString());
  }
}
