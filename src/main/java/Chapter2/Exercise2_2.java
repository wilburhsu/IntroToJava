package Chapter2;

import java.util.Scanner;

/**
 * Created by Admin on 2016/9/16.
 */
public class Exercise2_2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius and length of a cylinder:");
        double radius = scanner.nextDouble();
        double height = scanner.nextDouble();
        double π = Math.PI;

        double area = radius*radius*π;
        double volume = area*height;

        System.out.printf("The area is %8.4f\n",area);
        System.out.printf("The volume is %6.1f",volume);
    }
}
