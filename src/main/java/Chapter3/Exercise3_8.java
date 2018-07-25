package Chapter3;

import java.util.Scanner;

/**
 * Created by Wilbur Hsu on 2017/10/30.
 */
public class Exercise3_8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers in int,for example 1,3,2");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        if((number1 > number2) && (number1 > number3)){
            if(number2 > number3){
                System.out.println(number1 + " " + number2 + " " + number3);
            } else if(number3 > number2){
                System.out.println(number1 + " " + number3 + " " + number2);
            }
        }else if((number2 > number1) && (number2 > number3)){
            if(number1 > number3){
                System.out.println(number2 + " " + number1 + " " + number3);
            } else if(number3 > number1){
                System.out.println(number2 + " " + number3 + " " + number1);
            }
        }else if((number3 > number1) && (number3 > number2)){
            if(number1 > number2){
                System.out.println(number3 + " " + number1 + " " + number2);
            } else if(number2 > number1){
                System.out.println(number3 + " " + number2 + " " + number1);
            }

        }
    }

}

