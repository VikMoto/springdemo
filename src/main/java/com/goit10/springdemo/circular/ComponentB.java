package com.goit10.springdemo.circular;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Collection;

//@DependsOn("componentA")
@Service
public class ComponentB {
//    private final ApplicationContext context;
//
//    public ComponentB(ApplicationContext context) {
//        this.context = context;
//        System.out.println("Creating B");
//    }
//
//    @PostConstruct
//    public void init() {
//        getComponentA().print();
//    }
//    private ComponentA getComponentA() {
//    return context.getBean(ComponentA.class);
//        return context.getBeansOfType(ComponentA.class)
//                .values()
//                .stream()
//                .findFirst()
//                .orElse(null);
//    }

}
