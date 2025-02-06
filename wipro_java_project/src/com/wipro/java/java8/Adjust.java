package com.wipro.java.java8;

import java.time.LocalDate;
import java.time.DayOfWeek;
import java.time.temporal.TemporalAdjusters;

public class Adjust {

    // Function to check date and time according to our theme
    public static void checkingAdjusters() {
        LocalDate date = LocalDate.now();  // Get current date
        System.out.println("Today's Date: " + date);
        
        // Get the first day of the next month
        LocalDate firstDayOfNextMonth = date.with(TemporalAdjusters.firstDayOfNextMonth());
        System.out.println("The first day of next month: " + firstDayOfNextMonth);

        // Get the next Saturday
        LocalDate nextSaturday = date.with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
        System.out.println(" The next Saturday will be on: " + nextSaturday);

        // Get the last day of the current month
        LocalDate lastDayOfCurrentMonth = date.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(" The last day of this month is: " + lastDayOfCurrentMonth);

        // Get the previous Thursday
        LocalDate previousThursday = date.with(TemporalAdjusters.previous(DayOfWeek.THURSDAY));
        System.out.println("The previous Thursday was: " + previousThursday);
    }

    public static void main(String[] args) {
        checkingAdjusters();  // Call the method to check date adjustments
    }
}
