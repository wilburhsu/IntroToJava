package Chapter2;
import java.util.*;

/**
 * Created by Admin on 2016/9/16.
 */
public class Exercise2_6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000: ");
        int number = scanner.nextInt();
        if(number>=0 && number<=1000){
            int lastDigit = number%10;
            int remainNumber = number/10;
            int secondDigit = remainNumber%10;
            int firstDigit = number/100;
            int sum = lastDigit + secondDigit + firstDigit;
            System.out.print("The sum of the digit is " + sum);
        }else{
            System.out.print("The number is out of range.");
        }

    }

}
