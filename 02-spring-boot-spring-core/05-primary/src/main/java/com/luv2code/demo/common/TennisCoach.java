package com.luv2code.demo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class TennisCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practice backhand for 10 minutes :-)";
    }
}
