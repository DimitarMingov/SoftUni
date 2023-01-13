package Excersices;

import java.util.Scanner;

public class WorldSwimimingRecord_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. Входни данни:
        //- рекорд в секунди >= 100 000.00
        //- разстояние в метри >= 100 000.00
        //- времето в секунди, за което плува разстояние от 1 м. >= 1000.00

        double record = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double timeInSeconds = Double.parseDouble(scanner.nextLine());

        //2. Изчисления:
        //- На всеки 15 м. съпротивлението на водата увеличава времето с 12.5 секунди
        //- брой забавяния = цяло число (закръгление надолу)
        //- общо време за преплуване на цялото разстояние
        //- разликата = рекорд - общо време

        double slowDownCounts = Math.floor(distance / 15);
        double totalTime = distance * timeInSeconds;

        if (distance > 15) {
            totalTime = totalTime + slowDownCounts * 12.5;
        }

        double timeExcess = totalTime - record;

        //3. Изход:
        //- Ако общо време < рекорд -> "Yes, he succeeded! The new world record is {времето на Иван} seconds."
        //- Ако общо време >= рекорд -> "No, he failed! He was {недостигащите секунди} seconds slower."
        //- Резултатът трябва да се форматира до втория знак след десетичната запетая.

        if (totalTime < record) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTime);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", timeExcess);
        }
    }
}