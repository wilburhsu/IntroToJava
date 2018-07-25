package Chapter3;

import java.util.Scanner;

/**
 * Created by Wilbur Hsu on 2017/10/20.
 */
public class Exercise3_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a,b,c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double r1,r2;
        double discriminant = b*b - 4*a*c;

        if(discriminant > 0){
            r1 = ((-b)+Math.pow(discriminant,0.5))/(2*a);
            r2 = (b+Math.pow(discriminant,0.5))/(2*a);
            System.out.println("The equation has two roots " + r1 + " and " + r2);
        } else if(discriminant == 0){
            r1 = r2 = (-b)/(2*a);
            System.out.println("The equation has two roots " + r1);
        } else if(discriminant < 0){
            System.out.println("The equation has no real roots");
        }







    }

}
