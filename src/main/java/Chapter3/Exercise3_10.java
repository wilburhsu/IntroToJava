package Chapter3;

import java.util.Scanner;

/**
 * Created by Wilbur Hsu on 2017/10/30.
 */
public class Exercise3_10 {
    public static void main(String[] args) {
        int number1 = (int)(Math.random() * 100);
        int number2 = (int)(Math.random() * 100);

        System.out.println("What is " + number1 + " + " + number2 + "?");
        Scanner scanner = new Scanner(System.in);
        int answer = scanner.nextInt();
        if(number1 + number2 == answer)
            System.out.println("You are correct!");
        else {
            System.out.println("Your answer is wrong.");
            System.out.println(number1 + " + " + number2 + " should be " + (number1 + number2));
        }
    }
}
