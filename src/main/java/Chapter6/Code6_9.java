package Chapter6;

/**
 * Created by ubuntu on 16-10-16.
 * TestMethodOverloading
 */
public class Code6_9 {
    public static void main(String[] args) {
        System.out.println("The maxium between 3 and 4 is " + max(3,4));

        System.out.println("The maxium between 3.0 and 5.4 is " + max(3.0,5.4));

        System.out.println("The maxium between 3.0, 5.4 and 10.4 is " + max(3.0,5.4,10.14));

    }

    public static int max(int num1, int num2) {
        if(num1 > num2)
            return num1;
        else
            return num2;
    }

    private static double max(double num1, double num2) {
        if(num1 > num2)
            return num1;
        else
            return num2;
    }

    private static double max(double num1, double num2, double num3) {
        return max(max(num1,num2),num3);
    }
}
