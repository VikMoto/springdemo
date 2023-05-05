package com.goit10.springdemo.feature.service;

import com.goit10.springdemo.feature.time.InvalidTimeZoneException;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.TimeZone;

@Service
public class CurrentTimeService {
    public String getCurrentTime(String timezone) throws InvalidTimeZoneException {
        String format = "yyyy.MM.dd hh:mm:ss";
        return getCurrentTime(timezone,format);
    }
    public String getCurrentTime(String timezone, String format) throws InvalidTimeZoneException{
        if (timezone == null) {
            return LocalDateTime.now().format(
                    DateTimeFormatter.ofPattern(format));
        }

        if (!isTimeZoneExist(timezone)) {
            throw new InvalidTimeZoneException(timezone);
        }
        else {
            ZonedDateTime nowInZone = ZonedDateTime.now(ZoneId.of(timezone));
            return nowInZone.format(
                    DateTimeFormatter.ofPattern(format));
        }
    }

    private boolean isTimeZoneExist(String timezone) {
        return Arrays.stream(TimeZone.getAvailableIDs()).anyMatch(it -> it.equals(timezone));
    }


}
