package com.goit10.springdemo.component;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Scope("singleton")
@Scope("prototype")
@Component
public class ChildComponent {

    public ChildComponent() {
        System.out.println("Constructor child component");
    }

    public void hello() {
        System.out.println("hello, I`m child component");
    }
}
