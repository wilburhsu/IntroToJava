package Chapter4;

/**
 * Created by Wilbur Hsu on 2016/10/9.
 */
public class FutureTuition {
    public static void main(String[] args) {
        int year = 1;
        for(double tuition = 10000;tuition < 20000; year ++ )
            tuition *= 1.07;
        System.out.println("Tuition will be doubled in " + year + " years ");
    }

}
