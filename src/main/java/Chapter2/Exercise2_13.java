package Chapter2;

import java.util.Scanner;

/**
 * Created by Wilbur Hsu on 2017/10/17.
 */
public class Exercise2_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the monthly saving amount, rate of year and month: ");
        double savingAmount = input.nextDouble();
        double rateOfYear = input.nextDouble()/100;
        double rateOfMonth = rateOfYear/12;
        int month = input.nextInt();
        double currentMoney = 0;
        for(int i=1; i<=month; i++){
            currentMoney = (savingAmount + currentMoney) * (1 + rateOfMonth);
        }
        System.out.println("After the " + month + ", the account value is " + currentMoney);
    }

}
