package com.greenfox.exams.spring.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by posam on 2017-01-11.
 * WHAAAAAAAAAAAAAAAASSSSSUUUUUP
 */
@NoArgsConstructor
@Entity
@Getter
@Setter
@Table(name = "projects")
public class Project {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    Long id;

    @Column
    String title;

    @Column
    String[] tags;

    public Project(String title, String... tags) {
        this.title = title;
        this.tags = tags;
    }

    @Override
    public String toString() {
        String tagstring = getTags()[0];
        for (int i = 1; i < getTags().length; i++) {
            tagstring += ", " + getTags()[i];
        }
        return getTitle() + ": " + tagstring;
    }
}
