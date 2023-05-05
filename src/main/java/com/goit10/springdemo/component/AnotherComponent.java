package com.goit10.springdemo.component;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
@RequiredArgsConstructor
@Component
public class AnotherComponent {
    private final ChildComponent childComponent;


    @PostConstruct
    public void init() {
        childComponent.hello();
    }
}
