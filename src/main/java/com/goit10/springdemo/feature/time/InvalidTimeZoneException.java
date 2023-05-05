package com.goit10.springdemo.feature.time;

public class InvalidTimeZoneException extends RuntimeException{
    public InvalidTimeZoneException (String timezone) {
        super("Invalid timezone: " + timezone);
    }
}
