package com.goit10.springdemo.mvc;

import org.springframework.stereotype.Service;

@Service
public class LocalizeService {
    public String getCurrentTimeLabel(String acceptLanguage) {
        if ("uk".equals(acceptLanguage)) {
            return "Поточний час";
        } else {
            return "Current time";
        }
    }
}
