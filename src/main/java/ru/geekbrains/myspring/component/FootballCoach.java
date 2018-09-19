package ru.geekbrains.myspring.component;

import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {
    public String getCoachType() {
        return "Football is the best!";
    }
}
