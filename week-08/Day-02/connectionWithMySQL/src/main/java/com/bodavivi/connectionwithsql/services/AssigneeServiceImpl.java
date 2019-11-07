package com.bodavivi.connectionwithsql.services;

import com.bodavivi.connectionwithsql.models.Assignee;
import com.bodavivi.connectionwithsql.repositories.AssigneeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AssigneeServiceImpl implements AssigneeService {
  @Autowired
  AssigneeRepo assigneeRepo;

  @Override
  public Assignee findById(long id) {
    return (assigneeRepo.findById(id).orElse(null));
    }
}
