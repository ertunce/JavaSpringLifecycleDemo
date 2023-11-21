package com.bilgeadam.JavaSpringLifecyleDemo;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class LifecycleBean {
    @PostConstruct
    public void init() {
        System.out.println("LifecycleBean is initialized");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("LifecycleBean is destroyed");
    }
}
