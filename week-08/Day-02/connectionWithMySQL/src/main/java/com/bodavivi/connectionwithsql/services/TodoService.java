package com.bodavivi.connectionwithsql.services;

import com.bodavivi.connectionwithsql.models.Todo;

import java.util.List;

public interface TodoService {

 List<Todo> list(Boolean isActive);
 Todo findById(long id);
 List<Todo> searched(String string);

}
