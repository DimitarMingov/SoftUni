package CounditionalStatements.Exr;

import java.util.Scanner;

public class LunchBreak_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movie = scanner.nextLine();
        int episode = Integer.parseInt(scanner.nextLine());
        int breakDuration = Integer.parseInt(scanner.nextLine());

        double lunchtime = breakDuration / 8.0 ;
        double breaktime  = breakDuration / 4.0;


         double totalTime =episode + breaktime + lunchtime;

         if (totalTime <=  breakDuration) {
            System.out.printf("You have enough time to watch %s " + "and left with %.0f minutes free time.", movie , Math.ceil(breakDuration-totalTime));
        } else {
             System.out.printf("You don't have enough time to watch %s," + " you need %.0f more minutes.", movie , Math.ceil(totalTime- breakDuration));
         }




    }
}
