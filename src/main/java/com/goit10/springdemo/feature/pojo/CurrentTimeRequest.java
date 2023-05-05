package com.goit10.springdemo.feature.pojo;

import lombok.Data;
/*
 {
    "timezone": "UTC",
    "format": "yyyy.MM.dd hh:mm:ss"
 }
* */
@Data
public class CurrentTimeRequest {
    private String timezone;
    private String format;
}
