package com.diwakar;

import com.diwakar.entity.Usertable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class JPAApplication implements CommandLineRunner {

	@Autowired
	Userservice userservice;

    public static void main(String[] args) {
        SpringApplication.run(JPAApplication.class, args);
    }

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Startting the application");
		List<Usertable> usertables = userservice.getUsers("Tate");
		for(Usertable usertable : usertables){
			System.out.println(usertable.toString());
		}
	}
}
