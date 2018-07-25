package Chapter3;

import java.util.Scanner;

/**
 * Created by Wilbur Hsu on 2017/10/27.
 */
public class Exercise3_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a, b, c, d, e, f:");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();

        if((a*d - c*c) != 0){
            double x = (e*d - b*f)/(a*d - b*c);
            double y = (a*f - e*c)/(a*d - b*c);
            System.out.println("x is " + x + " and y is " + y);
        } else
            System.out.println("The equation has no solution");

    }

}
