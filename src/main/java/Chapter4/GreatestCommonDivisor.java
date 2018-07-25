package Chapter4;

import java.util.Scanner;

/**
 * Created by Wilbur Hsu on 2016/10/9.
 */
public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first integer: ");
        int n1 = in.nextInt();
        System.out.println("Enter second integer: ");
        int n2 = in.nextInt();
        int gcd = 1;
        for(int k = 2;k <= n1 && k <= n2;k++){
            if((n1%k == 0)&&(n2%k == 0))
                gcd = k;
        }
//        while(k<=n1&&k<=n2){
//            if((n1%k == 0)&&(n2%k == 0))
//                gcd = k;
//                k++;
//        }
        System.out.println("The greatest common divisor for " + n1 + " and " + n2 + " is " + gcd);
    }
}
