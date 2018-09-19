package ru.geekbrains.myspring.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HockeyCoach implements Coach {

    @Value("${coach}")
    private String testProp;

    public String getCoachType() {
        return "I like Hockey!" + " " + testProp;
    }
}
