package com.bodavivi.connectionwithsql.models;
import javax.persistence.*;
import java.util.List;

@Entity
public class Assignee {

  @GeneratedValue(strategy = GenerationType.AUTO)
  @Id
  private long id;
  private String name;
  private String email;
  @OneToMany(cascade = CascadeType.ALL, mappedBy = "assignee")
  private List<Todo> todos;

  public Assignee() {

  }

  public Assignee(String name, String email) {
    this.name = name;
    this.email = email;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void addTodo(Todo todo) {
    todo.setAssignee(this);
    todos.add(todo);
  }
}
