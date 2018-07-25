package Chapter2;

import java.util.Scanner;

/**
 * Created by Wilbur Hsu on 2017/10/17.
 */
public class Exercise2_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter v0, v1, and t: ");
        double v0 = input.nextDouble();
        double v1 = input.nextDouble();
        double time = input.nextDouble();
        double acceleration = (v1 - v0) / time;
        System.out.println("The average accelaration is: " + acceleration);
    }

}
