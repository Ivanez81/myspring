package ru.geekbrains.myspring.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TeamCoach {

    private Coach coach;

    @Autowired
    public TeamCoach(@Qualifier("hockeyCoach")Coach coach) {
        this.coach = coach;
    }

//    public Coach getCoach() {
//        return coach;
//    }
//
//    @Autowired
//    @Qualifier("hockeyCoach")
//    public void setCoach(Coach coach) {
//        this.coach = coach;
//    }

    @Override
    public String toString() {
        return this.coach.getCoachType();
    }
}
