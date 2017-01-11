package com.greenfox.exams.spring.services;

import org.springframework.stereotype.Component;

/**
 * Created by posam on 2017-01-11.
 * WHAAAAAAAAAAAAAAAASSSSSUUUUUP
 */
@Component
public class FormService {

    private String[] adjectives = new String[]{"amazing", "awesome", "blithesome", "excellent", "fabulous", "fantastic", "favorable", "fortuitous", "great", "incredible", "ineffable", "mirthful", "outstanding", "perfect", "propitious", "remarkable", "smart", "spectacular", "splendid", "stellar", "stupendous", "super", "ultimate", "unbelievable", "wondrous"};

    public boolean validate(String entry) {
        int keywordCounter = 0;
        for (String s : adjectives) {
            if (entry.contains(s)) {
                keywordCounter++;
            }
        }
        return keywordCounter >= 3;

    }
}
