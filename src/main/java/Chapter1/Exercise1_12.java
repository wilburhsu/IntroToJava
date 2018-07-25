package Chapter1;

/**
 * Created by ubuntu on 17-10-9.
 */
public class Exercise1_12 {

    public static void main(String[] args) {

        double mile = 24;
        double distance = mile * 1.6;
        double time = 60*60 + 40*60 + 35;
        double averspeed = distance/time * 3600;
        System.out.println("averspeed is " + averspeed);

    }
}
