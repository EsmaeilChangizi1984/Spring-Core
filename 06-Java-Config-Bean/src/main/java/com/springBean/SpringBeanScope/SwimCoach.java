package com.springBean.SpringBeanScope;

public class SwimCoach implements Coach {

    public SwimCoach() {
        System.out.println("In Cunstructor : " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkOut() {
        return "I can swim 1000 meter every day.";
    }
}
