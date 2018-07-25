package Chapter2;

import java.util.Scanner;

/**
 * Created by Wilbur Hsu on 2017/10/20.
 */
public class Exercise2_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter x1 and y1: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        System.out.println("Enter x2 and y2: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double a = Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2);
        double distance = Math.pow(a,0.5);
        System.out.println("The distance between the two points is " + distance);

    }

}
