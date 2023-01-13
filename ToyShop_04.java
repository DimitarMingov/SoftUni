package CounditionalStatements.Exr;

import java.util.Scanner;

public class ToyShop_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double Holidayprice = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int bears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        double Totalprice =  puzzles * 2.60 + dolls * 3.00 + bears * 4.10 + minions * 8.20 + trucks * 2.00;
        int totalnumbers = puzzles +dolls +bears +minions +trucks;

        if(totalnumbers >= 50) {
            Totalprice = Totalprice - Totalprice * 0.25;
        }
        Totalprice = Totalprice - Totalprice*0.10;
        if(Totalprice>=Holidayprice) {
            System.out.printf("Yes! %.2f lv left.", Totalprice - Holidayprice );
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", Holidayprice - Totalprice);
        }
    }

}
