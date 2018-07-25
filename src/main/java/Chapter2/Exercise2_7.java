package Chapter2;

import java.util.Scanner;

/**
 * Created by Wilbur Hsu on 2017/10/17.
 */
public class Exercise2_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of minutes: ");
        int minutes = input.nextInt();
        int hour = minutes / 60;
        int day = hour / 24;
        int year = day / 365;
        int remainDay  = day % 365;
        System.out.println(minutes + " minutes is approximately "
                + year + " years and " + remainDay + " days");

    }

}
