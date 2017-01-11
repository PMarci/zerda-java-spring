package com.greenfox.exams.spring.services;

import com.greenfox.exams.spring.models.FormInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * Created by posam on 2017-01-11.
 * WHAAAAAAAAAAAAAAAASSSSSUUUUUP
 */


@Repository
@Component
public interface FormInfoRepository extends JpaRepository<FormInfo, Long> {

}
