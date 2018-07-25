package Chapter2;

import java.util.Scanner;

/**
 * Created by Admin on 2016/9/16.
 */
public class Exercise2_4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number in pounds:");
        double pounds = scanner.nextDouble();
        final  double coefficient = 0.454;
        double kilo = pounds * coefficient;
        System.out.println(pounds + " pounds is " + kilo + " kilograms");
    }
}
