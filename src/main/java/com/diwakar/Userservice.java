package com.diwakar;

import com.diwakar.entity.Usertable;
import com.diwakar.repo.UserRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Userservice {
    @Autowired
    UserRepositories  userRepositories;

    public List<Usertable> getUsers(String firstName) {
    return  userRepositories.firstName(firstName);
    }
}
