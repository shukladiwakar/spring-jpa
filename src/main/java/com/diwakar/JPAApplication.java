package com.diwakar;

import com.diwakar.dto.UserDTO;
import com.diwakar.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class JPAApplication implements CommandLineRunner {

	@Autowired
	UserDTO userDTO;

    public static void main(String[] args) {
        SpringApplication.run(JPAApplication.class, args);
    }

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Startting the application");
		List<User> users = userDTO.getUsers("Tate");
		for (User user : users) {
			System.out.println(user.toString());
		}
	}
}
