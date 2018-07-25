package Chapter2;

import java.util.Scanner;

/**
 * Created by Wilbur Hsu on 2017/10/20.
 */
public class Exercise2_17 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
        double t_a = input.nextDouble();
        System.out.println("Enter the wind speed (>=2) in miles per hour: ");
        double windSpeed = input.nextDouble();
        double t_wc = 35.74 + 0.6215*t_a - 35.75 * Math.pow(windSpeed,0.16)
                + 0.4275 * t_a * Math.pow(windSpeed,0.16);
        System.out.println("The wind chill index is " + t_wc);
    }

}
