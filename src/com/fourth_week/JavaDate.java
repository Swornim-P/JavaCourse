package com.fourth_week;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class JavaDate {
    public static void main(String[] args) {
        LocalDate todayDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String todayFormattedDate = dateTime.format(formatter);
        System.out.println(todayDate);
        System.out.println(currentTime);
        System.out.println(dateTime);
        System.out.println(todayFormattedDate);

    }
}
