package com.goit10.springdemo.component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

//@Component
public class TestComponent {
    public TestComponent() {
        System.out.println("In constructor");
    }

    @PostConstruct
    public void init() {
        System.out.println("In Postconstructor");
    }
    @PostConstruct
    public void init2() {
        System.out.println("In Postconstructor2");
    }

    @PreDestroy
    public void onDestroy() {
        System.out.println("In destroy");
    }
}
