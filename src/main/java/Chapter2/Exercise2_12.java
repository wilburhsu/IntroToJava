package Chapter2;

import java.util.Scanner;

/**
 * Created by Wilbur Hsu on 2017/10/18.
 */
public class Exercise2_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter speed and acceleration: ");
        double speed = input.nextDouble();
        double acceleration = input.nextDouble();
        double length = (speed*speed)/(2*acceleration);
        System.out.println("The minimum runway length for this airplane is: " + length);
    }

}
