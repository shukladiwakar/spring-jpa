package com.diwakar.repo;

import com.diwakar.entity.Usertable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepositories extends CrudRepository<Usertable, Integer> {
    List<Usertable> firstName(String firstName);
}
