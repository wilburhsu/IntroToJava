package Chapter3;

import java.util.Scanner;

/**
 * Created by Wilbur Hsu on 2017/10/27.
 */
public class Exercise3_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter today's day:");
        int today = input.nextInt();
        System.out.println("Enter the number of days elapsed since today:");
        int numberOfDaysElapsed = input.nextInt();
        int futureDay = (today + numberOfDaysElapsed%7)%7;
        String output = "";
        switch (today){
            case 0:output = "Sunday";break;
            case 1:output = "Monday";break;
            case 2:output = "Tuesday";break;
            case 3:output = "Wednesday";break;
            case 4:output = "Thursday";break;
            case 5:output = "Friday";break;
            case 6:output = "Saturday";
        }
        String weekOfFutureDay = "";
        switch (futureDay){
            case 0:weekOfFutureDay = "Sunday";break;
            case 1:weekOfFutureDay = "Monday";break;
            case 2:weekOfFutureDay = "Tuesday";break;
            case 3:weekOfFutureDay = "Wednesday";break;
            case 4:weekOfFutureDay = "Thursday";break;
            case 5:weekOfFutureDay = "Friday";break;
            case 6:weekOfFutureDay = "Saturday";
        }
        System.out.println("Today is " + output + " and the future is " + weekOfFutureDay);

    }


}
