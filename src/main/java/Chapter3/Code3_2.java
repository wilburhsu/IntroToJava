package Chapter3;

import java.util.Scanner;

/**
 * Created by Wilbur Hsu on 2017/10/24.
 * SimpleIfDemo
 */
public class Code3_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int number = input.nextInt();

        if(number % 5 == 0)
            System.out.println("HiFive");
        if(number % 2 == 0)
            System.out.println("HiEven");

    }
}
