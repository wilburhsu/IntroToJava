package Chapter2;

import java.util.Scanner;

/**
 * Created by Wilbur Hsu on 2017/10/16.
 */
public class Exercise2_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a value for feet: ");
        double feet = input.nextDouble();
        double meter = feet * 0.305;
        System.out.println( feet + " feet is " + meter + " meters");
    }

}
