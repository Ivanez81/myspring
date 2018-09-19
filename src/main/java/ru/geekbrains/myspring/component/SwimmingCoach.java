package ru.geekbrains.myspring.component;

import org.springframework.stereotype.Component;

@Component
public class SwimmingCoach implements Coach {
    public String getCoachType() {
        return "Swimming is cool!";
    }
}
