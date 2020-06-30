package com.mypackage.expressions.datetime;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class CurrentZone {
    public static void main(String[] args) {
        ZoneId zone = ZoneId.systemDefault();
        System.out.println("You're in " + zone + " Zone. Local time now is " + LocalTime.now());
        System.out.println();
        ZoneId in = ZoneId.of("Asia/Kolkata");
        ZonedDateTime dt = ZonedDateTime.now(in);
        System.out.println(dt);
    }
}
