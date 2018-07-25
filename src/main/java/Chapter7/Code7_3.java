package Chapter7;

/**
 * Created by Wilbur Hsu on 2016/10/19.
 */
public class Code7_3 {
    public static void main(String[] args) {
        int[] a = {1,2};

        System.out.println("Before invoking swap");
        System.out.println("array is {"+ a[0] + "," + a[1] + "}" );
        swap(a[0],a[1]);
        System.out.println("After invoking swap");
        System.out.println("array is {"+ a[0] + "," + a[1] + "}" );

        System.out.println("Before invoking swapFirstTwoInArray");
        System.out.println("array is {"+ a[0] + "," + a[1] + "}" );
        swapFirstTwoInArray(a);
        System.out.println("After invoking swapFirstTwoInArray");
        System.out.println("array is {"+ a[0] + "," + a[1] + "}" );

    }

    private static void swap(int n1, int n2) {
        int temp = n1;
        n1 = n2;
        n2 = temp;
    }

    private static void swapFirstTwoInArray(int[] array) {
        int temp = array[0];
        array[0] = array[1];
        array[1] = temp;
    }
}
