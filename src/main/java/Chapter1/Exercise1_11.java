package Chapter1;

/**
 * Created by ubuntu on 17-10-9.
 */
public class Exercise1_11 {
    public static void main(String[] args) {
        int day = 365;
        int second = day * 24 * 60 * 60;
        double born = second/7;
        double dead = second/13;
        double immigrant = second/45;
        long total = 312032486;
        double networthPeople = born - dead + immigrant;
        int FirstYear = (int)(total + networthPeople);
        int SecondYear = (int)(total + networthPeople * 2);
        int ThirdYear = (int)(total + networthPeople * 3);
        int ForthYear = (int)(total + networthPeople * 4);
        int FifthYear = (int)(total + networthPeople * 5);
        System.out.println(FirstYear);
        System.out.println(SecondYear);
        System.out.println(ThirdYear);
        System.out.println(ForthYear);
        System.out.println(FifthYear);

    }

}
