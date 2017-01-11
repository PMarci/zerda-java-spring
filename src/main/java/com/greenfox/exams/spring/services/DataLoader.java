package com.greenfox.exams.spring.services;

import com.greenfox.exams.spring.models.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by posam on 2017-01-11.
 * WHAAAAAAAAAAAAAAAASSSSSUUUUUP
 */
@Component
public class DataLoader implements CommandLineRunner {
    @Autowired
    ProjectRepository repo;

    @Override
    public void run(String... strings) throws Exception { //added more tags to show vararg support
        repo.save(new Project("Clash of Zerda", "android", "game"));
        repo.save(new Project("Clash of Zerda", "spring", "backend"));
        repo.save(new Project("Zerda Reader", "android", "reader", "tool"));
        repo.save(new Project("Zerda Reader", "spring"));
        repo.save(new Project("Konnekt Contact Manager", "spring", "organizing", "social"));
    }
}
