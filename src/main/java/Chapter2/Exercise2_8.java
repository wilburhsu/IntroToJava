package Chapter2;

import java.util.Scanner;

/**
 * Created by Wilbur Hsu on 2016/9/19.
 */
public class Exercise2_8 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the time zone offset to GMT: ");
        int GMT = input.nextInt();
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;
        System.out.println("Current time is " + (currentHour + GMT) + ":" + currentMinute + ":" + currentSecond);

    }

}
