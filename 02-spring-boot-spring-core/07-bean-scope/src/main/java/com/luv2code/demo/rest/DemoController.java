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
    private Coach anotherCoach;

    @Autowired
    public DemoController(@Qualifier("tennisCoach") Coach theCoach,
            @Qualifier("tennisCoach") Coach theAnotherCoach) {
        // System.out.println("In constructor: " + getClass().getSimpleName());

        myCoach = theCoach;
        anotherCoach = theAnotherCoach;

    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/check")
    public String check() {
        return "Comparign beans: myCoach = anotherCoach, " + (myCoach == anotherCoach);
    }
}
