package com.bodavivi.connectionwithsql.repositories;
import com.bodavivi.connectionwithsql.models.Assignee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssigneeRepo extends CrudRepository<Assignee, Long> {
}
