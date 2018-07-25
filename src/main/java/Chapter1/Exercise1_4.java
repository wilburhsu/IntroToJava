package Chapter1;

/**
 * Created by ubuntu on 17-10-9.
 */
public class Exercise1_4 {
    public static void main(String[] args) {
        System.out.printf("%-6s%-6s%-6s\n","a","a^2","a^3");
        for(int i= 1; i < 5; i++)
            System.out.printf("%-6d%-6d%-6d\n",i,i*i,i*i*i);
    }

}
