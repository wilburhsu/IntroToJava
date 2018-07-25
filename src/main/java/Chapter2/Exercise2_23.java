package Chapter2;

import java.util.Scanner;

/**
 * Created by Wilbur Hsu on 2017/10/20.
 */
public class Exercise2_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the driving distance: ");
        double distance = input.nextDouble();
        System.out.println("Enter miles per gallon: ");
        double milesPerGallon = input.nextDouble();
        System.out.println("Enter price per gallon: ");
        double pricePerGallon = input.nextDouble();
        double cost = distance / milesPerGallon * pricePerGallon;
        System.out.println("The cost of driving is $" + cost);
    }
}







