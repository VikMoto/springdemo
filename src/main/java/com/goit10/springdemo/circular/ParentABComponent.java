package com.goit10.springdemo.circular;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ParentABComponent {
    private final ComponentA componentA;
    private final ComponentB componentB;

    public void init() {
        System.out.println(componentA + " print " + componentB);
    }
}
