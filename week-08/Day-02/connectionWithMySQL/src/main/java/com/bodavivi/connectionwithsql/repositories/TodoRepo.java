package com.bodavivi.connectionwithsql.repositories;
import com.bodavivi.connectionwithsql.models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepo extends CrudRepository<Todo, Long> {

}
