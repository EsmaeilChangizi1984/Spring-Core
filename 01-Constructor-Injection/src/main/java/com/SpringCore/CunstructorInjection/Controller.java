package com.SpringCore.CunstructorInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    private Car myCar;

    @Autowired
    public Controller(Car theCar) {
        myCar = theCar;
    }

    @GetMapping("/Speed")
    public String getSpeed() {
        return myCar.getSpeed();

    }

}