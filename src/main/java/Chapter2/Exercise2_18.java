package Chapter2;

import java.util.Scanner;

/**
 * Created by Wilbur Hsu on 2017/10/20.
 */
public class Exercise2_18 {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
        System.out.printf("%-5s%-5s%-5s\n","a","b","pow(a,b)");
        for(int i=1;i<6;i++){
            System.out.printf("%-5d%-5d%-5d\n",i,i+1,(int)(Math.pow(i,i+1)));

        }
    }
    
}
