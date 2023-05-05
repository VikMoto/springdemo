package com.goit10.springdemo.circular;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ComponentA {
//   private final ApplicationContext context;
//
//
//    public ComponentA(ApplicationContext context) {
//        this.context = context;
//        System.out.println("Creating A");
//    }

   public void print() {
       System.out.println("I am component A");
   }

//    private ComponentB getComponentB() {
//        return context.getBeansOfType(ComponentB.class)
//                .values()
//                .stream()
//                .findFirst()
//                .orElse(null);
//    }
}
