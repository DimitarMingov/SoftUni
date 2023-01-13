package CounditionalStatements.Exr;

import java.util.Scanner;

public class SumSeconds_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int First = Integer.parseInt(scanner.nextLine());
        int Second = Integer.parseInt(scanner.nextLine());
        int Third = Integer.parseInt(scanner.nextLine());
        int Total = First + Second + Third;
        int minutes = Total / 60;
        int seconds = Total % 60;

        if (seconds < 10) {
            System.out.printf("%d:0%d",minutes, seconds);
        } else {
            System.out.printf("%d:%d", minutes,seconds);
        }
    }
}
