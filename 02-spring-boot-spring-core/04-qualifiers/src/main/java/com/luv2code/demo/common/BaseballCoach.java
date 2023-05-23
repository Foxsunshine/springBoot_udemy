package com.luv2code.demo.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Speng 30 minutes in batting practice";
    }

}
