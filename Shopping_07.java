package CounditionalStatements.Exr;

import java.util.Scanner;

public class Shopping_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double budget = Double.parseDouble(scanner.nextLine());
        double videocard = Double.parseDouble(scanner.nextLine());
        int procesor = Integer.parseInt(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());


        double videocardPrice = 250 * videocard;
        double procesorPrice = videocardPrice * 0.35;
        double ramPrice = videocardPrice * 0.10;

        double TotalPrice = videocardPrice + procesor * procesorPrice + ram * ramPrice;
        if (videocard > procesor) {
            TotalPrice = TotalPrice - TotalPrice * 0.15;
        }
        if (budget >= TotalPrice) {
            System.out.printf("You have %.2f leva left!", budget - TotalPrice);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", TotalPrice - budget);
        }
    }
}
