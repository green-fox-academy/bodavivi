package com.bodavivi.listingtodos.repositories;

import com.bodavivi.listingtodos.models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepo extends CrudRepository<Todo, Long> {
}
