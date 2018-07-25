package Chapter6;

/**
 * Created by Wilbur Hsu on 2017/11/22.
 */
public class Code6_5 {

    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;
        System.out.println("before:\n" + "num1:" + num1 + "\nnum2:" + num2);
        swap(num1,num2);
        System.out.println("after:\n" + "num1:" + num1 + "\nnum2:" + num2);
    }

    public static void swap(int n1,int n2) {
        System.out.println("inside");
        System.out.println("before swapping:\n" + "n1:" + n1 + "\nn2:" + n2);

        int temp = n1;
        n1 = n2;
        n2 = temp;

        System.out.println("after swapping:\n" + "n1:" + n1 + "\nn2:" + n2);

    }

}

