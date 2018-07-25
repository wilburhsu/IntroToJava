package Chapter2;

import java.util.Scanner;

/**
 * Created by Wilbur Hsu on 2017/10/20.
 */
public class Exercise2_19 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three points for a triangle: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        double s1 = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        double s2 = Math.sqrt((x3-x1)*(x3-x1) + (y3-y1)*(y3-y1));
        double s3 = Math.sqrt((x3-x2)*(x3-x2) + (y3-y2)*(y3-y2));
        double s = (s1 + s2 + s3) / 2;
        double area = Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
        System.out.println("The area of the triangle is " + area);
    }

}
