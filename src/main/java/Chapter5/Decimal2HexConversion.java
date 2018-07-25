package Chapter5;
import java.util.Scanner;

/**
 * Created by ubuntu on 16-10-16.
 */
public class Decimal2HexConversion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a decimal number: ");
        int decimal = in.nextInt();

        System.out.println("The hex number for decimal "+ decimal + " is " + decimalToHex(decimal));
    }

    private static String decimalToHex(int decimal){
        String hex = "";

        while(decimal != 0){
            int hexValue = decimal % 16;
            hex = toHexChar(hexValue) + hex ;
            decimal = decimal/16;
        }
        return hex;
    }

    private static char toHexChar(int hexValue) {
        if (hexValue <= 9 && hexValue >= 0)
            return (char)(hexValue + '0');
        else
            return (char)(hexValue - 10 + '0');
    }


}
