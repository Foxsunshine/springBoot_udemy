package com.luv2code.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.demo.common.Coach;

@RestController
public class DemoController {

    // define a private field for coach
    private Coach myCoach;

    @Autowired
    public DemoController(@Qualifier("swimCoach") Coach theCoach) {
        // System.out.println("In constructor: " + getClass().getSimpleName());

        myCoach = theCoach;

    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }

}
