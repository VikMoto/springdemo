package com.goit10.springdemo.feature.pojo;

import lombok.Builder;
import lombok.Data;


@Builder
@Data
public class CurrentTimeResponse {
    private boolean success;
    private Error error;

    public String time;
    public enum Error {
        ok,
        invalidTimezone
    }

    public static CurrentTimeResponse success(String time) {
        return CurrentTimeResponse.builder().success(true).error(Error.ok).time(time).build();
    }
    public static CurrentTimeResponse failed(Error error) {
        return CurrentTimeResponse.builder().success(false).error(error ).build();
    }
}
