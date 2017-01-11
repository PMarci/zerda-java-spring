package com.greenfox.exams.spring.services;

import com.greenfox.exams.spring.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by posam on 2017-01-11.
 * WHAAAAAAAAAAAAAAAASSSSSUUUUUP
 */

@Repository
@Component
public interface ProjectRepository extends JpaRepository<Project, Long> {

    List<Project> findAll();
}
