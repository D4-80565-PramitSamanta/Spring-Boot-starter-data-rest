package com.datarest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.datarest.entity.User;
import com.datarest.repo.UserRepo;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    @Autowired
    UserRepo urepo;


    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        User user1 = new User(null, "John", "Doe", "john@example.com");
        User user2 = new User(null, "Alice", "Smith", "alice@example.com");
        User user3 = new User(null, "Bob", "Johnson", "bob@example.com");
        User user4 = new User(null, "Emily", "Davis", "emily@example.com");
        User user5 = new User(null, "Michael", "Wilson", "michael@example.com");

        urepo.save(user1);
        urepo.save(user2);
        urepo.save(user3);
        urepo.save(user4);
        urepo.save(user5);
    }
}
