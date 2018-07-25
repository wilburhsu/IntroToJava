package Chapter2;

import java.util.Scanner;

/**
 * Created by Wilbur Hsu on 2017/10/17.
 */
public class Exercise2_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter weight in pounds:");
        double weight = input.nextDouble();
        System.out.println("Enter height in inches:");
        double height = input.nextDouble();
        double kilo = weight * 0.45359237;
        double meter = height * 0.0254;
        double BMI = kilo / (meter * meter);
        System.out.println("BMI is " + BMI);
    }

}
