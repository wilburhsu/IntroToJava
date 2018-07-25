package Chapter3;

import java.util.Scanner;

/**
 * Created by Wilbur Hsu on 2017/10/30.
 *
 * ★★
 */
public class Exercise3_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an amount in double, for example 11.56: ");
        double amount = input.nextDouble();

        int remainingAmount = (int)(amount * 100);

        int numberOfOneDollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;

        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;

        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;

        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;

        int numberOfPennies = remainingAmount;

        String output = "Your amount " + amount + " consists of ";

        if(numberOfOneDollars > 1){
            output += numberOfOneDollars + " dollars ";
        } else if (numberOfOneDollars == 1){
            output += numberOfOneDollars + " dollar ";
        }else
            output = output;

        if(numberOfQuarters > 1){
            output += " and " + numberOfQuarters + " quarters ";
        } else if (numberOfQuarters == 1){
            output += " and " + numberOfOneDollars + " quarter ";
        }else
            output = output;

        if(numberOfNickels > 1){
            output += " and " + numberOfNickels + " nickels ";
        } else if (numberOfQuarters == 1){
            output += " and " + numberOfNickels + " nickel ";
        }else
            output = output;

        if(numberOfDimes > 1){
            output += " and " + numberOfDimes + " dimes ";
        } else if (numberOfDimes == 1){
            output += " and " + numberOfDimes + " dime ";
        }else
            output = output;

        if(numberOfPennies > 1){
            output += " and " + numberOfPennies + " pennies";
        } else if (numberOfPennies == 1){
            output += " and " + numberOfPennies + " penny";
        }else
            output = output;

        System.out.println(output);


    }


}
