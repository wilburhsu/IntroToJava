package Chapter2;

import java.util.Scanner;

/**
 * Created by Wilbur Hsu on 2017/10/20.
 */
public class Exercise2_21 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter invsetment amonut: ");
        double invsetmentAmonut = input.nextDouble();
        System.out.println("Enter annual interest rate in percentage: ");
        double interestRate = input.nextDouble()/100;
        System.out.println("Enter number of years: ");
        int numberOfYears = input.nextInt();
        double totalAmount = invsetmentAmonut * Math.pow((1 + interestRate/12),numberOfYears*12);
        System.out.println("Accumulated value is " + totalAmount);

    }
}
