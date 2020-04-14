package com.diwakar;

import com.diwakar.entity.User;
import com.diwakar.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Userservice {
    @Autowired
    UserRepository userRepository;

    public List<User> getUsers(String firstName) {
        return userRepository.firstName(firstName);
    }
}
