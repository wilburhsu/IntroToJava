package Chapter1;

import java.util.Scanner;

/**
 * Created by ubuntu on 17-10-9.
 */
public class Exercise1_13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("input a: ");
        double a = in.nextDouble();
        System.out.print("input b: ");
        double b = in.nextDouble();
        System.out.print("input c: ");
        double c = in.nextDouble();
        System.out.print("input d: ");
        double d = in.nextDouble();
        System.out.print("input e: ");
        double e = in.nextDouble();
        System.out.print("input f: ");
        double f = in.nextDouble();
        double x = (e*d - b*f)/(a*d - b*c);
        double y = (a*f - e*c)/(a*d - b*c);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }


}
