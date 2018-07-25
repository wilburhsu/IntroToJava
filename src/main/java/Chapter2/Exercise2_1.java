package Chapter2;

import java.util.Scanner;

/**
 * Created by Wilbur Hsu on 2017/10/16.
 */
public class Exercise2_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a degree in Celsius: ");
        double celsius = input.nextDouble();
        double fahrenheit = (9.0/5) * celsius + 32;
        System.out.println(celsius + " Celsius " + fahrenheit + " Fahrenheit");
    }

}
