package Chapter3;

import java.util.Scanner;

/**
 * Created by Wilbur Hsu on 2017/10/24.
 * AdditionQuiz
 */
public class Code3_1 {
    public static void main(String[] args) {
        int number1 = (int)(System.currentTimeMillis() % 10);
        int number2 = (int)(System.currentTimeMillis() / 7 % 10);

        Scanner input = new Scanner(System.in);
        System.out.println("What is " + number1  + " + " + number2 + "?");

        int answer = input.nextInt();

        System.out.println(number1 + " + " + number2 + " = " + answer + " is " +
                (number1 + number2 == answer));

    }

}
