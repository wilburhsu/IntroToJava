package Chapter30;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Wilbur Hsu on 2017/11/6.
 * ExecutorDemo
 */
public class ExecutorDemo {
    public static void main(String[] args){
        ExecutorService executor = Executors.newFixedThreadPool(3);

        executor.execute(new PrintChar('a',100));
        executor.execute(new PrintChar('b',100));
        executor.execute(new PrintNum(100));

        executor.shutdown();

    }
}
