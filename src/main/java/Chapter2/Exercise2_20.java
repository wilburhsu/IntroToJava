package Chapter2;
import java.util.*;
/**
 * Created by Wilbur Hsu on 2016/9/19.
 */
public class Exercise2_20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter balance and interest rate (e.g.,3 for 3%):");
        double balance = in.nextDouble();
        double rate = in.nextDouble();
        double interest = balance*rate/1200;
        /*
        double annualInterestRate = input.nextDouble();
        double monthlyInterestRate = annualInterestRate / 1200;
        double interest = balance * monthlyInterestRate;
        */

        System.out.printf("The interest is %8.5f",interest);

        //System.out.println("The interest is " + (int)(100* interest) / 100.0);
    }

}
