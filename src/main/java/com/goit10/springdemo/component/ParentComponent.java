package com.goit10.springdemo.component;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
@RequiredArgsConstructor
@Component
public class ParentComponent {
//    @Autowired
    private final ChildComponent childComponent;

//    @Autowired
//    public ParentComponent(ChildComponent childComponent) {
//        this.childComponent = childComponent;
//    }

//    @Autowired
//    public void setChildComponent(ChildComponent childComponent) {
//        this.childComponent = childComponent;
//    }

//    public ParentComponent(ChildComponent childComponent, int x) {
//        this.childComponent = childComponent;
//    }


    @PostConstruct
    public void init() {
        childComponent.hello();
    }
}
