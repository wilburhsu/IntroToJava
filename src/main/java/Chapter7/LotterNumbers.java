package Chapter7;

import java.util.Scanner;

/**
 * Created by Wilbur Hsu on 2016/10/19.
 */
public class LotterNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean[] isCovered = new boolean[99];

        //从文件中读取每一个数字，并将数组中相应位置的元素置为true，比如读取的是56，那么将isCovered[56]置为true
        int number = in.nextInt();
        while(number != 0){
            isCovered[number-1] = true;
            number = in.nextInt();
        }

        boolean allCovered = true;
        for(int i=0; i<99; i++)
            if(!isCovered[i]){
                allCovered = false;//遍历数组isCovered，如果其中有某个元素为false，将allCovered置为false
                break;
        }

        if(allCovered)
            System.out.println("The tickets cover all numbers");
        else
            System.out.println("The tickets don't cover all numbers");

    }
}
