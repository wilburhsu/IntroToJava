package Chapter6;

import java.util.Scanner;

/**
 * Created by Wilbur Hsu on 2017/11/30.
 * Hex2Dec
 */
public class Code6_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a hex number: ");
        String hex = input.nextLine();
        System.out.println("The decimal value for hex number " + hex
                + " is " + hexToDecimal(hex.toUpperCase()));

    }

    public static int hexToDecimal(String hex){
        int decimalValue = 0;
        for(int i = 0; i < hex.length(); i++ ){
            char hexChar = hex.charAt(i);
            decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
        }
        return decimalValue;
    }

    public  static int hexCharToDecimal(char ch){
        if(ch >= 'A' && ch<= 'F')
            return 10 + ch - 'A';
        else
            return ch - '0';

    }

}
