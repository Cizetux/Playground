package me.cizetux;

import java.time.LocalTime;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class BasicAlarmClock {

    public static void main(String[] args) throws InterruptedException {
        Scanner keyboardScanner = new Scanner(System.in);
        LocalTime time = askCorrectTimeValue(keyboardScanner);
        waitUntilTime(time);
        System.out.println("Alarm! Wake up!");
        keyboardScanner.close();
    }

    static LocalTime askCorrectTimeValue(Scanner scanner) {
        System.out.println("Please provide the time when the alarm will stops.");

        try {
            return LocalTime.parse(scanner.nextLine());
        } catch (DateTimeParseException var2) {
            System.out.println("The time value you've entered is not a correct format. Please use a format like: hh:mm:ss");
            return askCorrectTimeValue(scanner);
        }
    }

    static void waitUntilTime(LocalTime time) throws InterruptedException {
        while (LocalTime.now().isBefore(time)) {
            Thread.sleep(1000L);
        }

    }
}
