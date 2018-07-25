package Chapter2;

import java.util.Scanner;

/**
 * Created by Wilbur Hsu on 2017/10/17.
 */
public class Exercise2_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int day = 365;
        int second = day * 24 * 60 * 60;
        double born = second / 7;
        double dead = second / 13;
        double immigrant = second / 45;
        long total = 312032486;
        double networthPeople = born - dead + immigrant;
        int FirstYear = (int) (total + networthPeople);
        int SecondYear = (int) (total + networthPeople * 2);
        int ThirdYear = (int) (total + networthPeople * 3);
        int ForthYear = (int) (total + networthPeople * 4);
        int FifthYear = (int) (total + networthPeople * 5);
        System.out.println("Enter the number of years: ");
        int year = input.nextInt();
        switch(year){
            case 1:
                System.out.println("The population in " + year + " is " + FirstYear);
                break;
            case 2:
                System.out.println("The population in " + year + " is " + SecondYear);
                break;
            case 3:
                System.out.println("The population in " + year + " is " + ThirdYear);
                break;
            case 4:
                System.out.println("The population in " + year + " is " + ForthYear);
                break;
            case 5:
                System.out.println("The population in " + year + " is " + FifthYear);
                break;
            default:
                System.out.println("Error");
                System.exit(1);
        }
    }

}
