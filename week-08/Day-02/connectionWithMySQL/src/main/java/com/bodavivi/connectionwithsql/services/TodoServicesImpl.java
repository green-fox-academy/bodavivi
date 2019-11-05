package com.bodavivi.connectionwithsql.services;
import com.bodavivi.connectionwithsql.models.Todo;
import com.bodavivi.connectionwithsql.repositories.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TodoServicesImpl implements TodoService{
  @Autowired
  TodoRepo repo;

  @Override
  public List<Todo> list(Boolean isActive) {
    if (isActive){
     return  ((List<Todo>) repo.findAll()).stream().filter(todo -> !todo.isDone()).collect(Collectors.toList());
    }else {
      return ((List<Todo>) repo.findAll()).stream().filter(todo -> todo.isDone()).collect(Collectors.toList());
    }
  }
}
