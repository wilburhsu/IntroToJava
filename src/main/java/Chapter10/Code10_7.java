package Chapter10;

/**
 * Created by Wilbur Hsu on 2018-1-2.
 * TestStackOfIntegers
 */
public class Code10_7 {
    public static void main(String[] args) {
        Code10_8 stack = new Code10_8();

        for(int i=0;i<10;i++)
            stack.push(i);

        while (!stack.empty())
            System.out.print(stack.pop() + " ");
    }
}
