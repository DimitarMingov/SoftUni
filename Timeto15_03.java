package ConditionalStatements.Exercises;

import java.util.Scanner;

public class Timeto15_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int minute = Integer.parseInt(scanner.nextLine());
        // hour -> minute = hour * 60
        //time -> minute / 60; minute % 60
        int time = (hour * 60 + minute) + 15;
        int hourTime = time / 60;
        int minuteTime = time % 60;

        if (hourTime >= 24) {
            hourTime = 0;
        }
        if (minuteTime < 10) {
            System.out.printf("%d:0%d", hourTime, minuteTime);
        } else {
            System.out.printf("%d:%d", hourTime, minuteTime);
        }

    }
}

