package Chapter2;

import java.util.Scanner;

/**
 * Created by Wilbur Hsu on 2017/10/17.
 */
public class Exercise2_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount of water in kilograms: ");
        double amount = input.nextDouble();
        System.out.println("Enter the initial temperature:");
        double initialTemp = input.nextDouble();
        System.out.println("Enter the final temperature:");
        double finalTemp = input.nextDouble();
        double energy = amount * (finalTemp - initialTemp) * 4184;
        System.out.println("The energy needed is " + energy);

    }


}
