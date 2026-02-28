package com.comp367;

import java.time.LocalTime;

public class App {
    public static void main(String[] args) {
        int hour = LocalTime.now().getHour();
        String greeting = (hour < 12) ? "Good morning" : "Good afternoon";
        System.out.println(greeting + ", Justine Aldea, Welcome to COMP367");
    }
}