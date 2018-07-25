package Chapter17;

import java.io.FileInputStream;
import java.io.FileOutputStream;
/**
 * Created by Wilbur Hsu on 2017/12/7.
 * TestFileStream
 */


public class Code17_1 {
    public static void main(String[] args) {
        try(
                FileOutputStream output = new FileOutputStream("temp.dat");
        ) {
            for(int i=1;i<=10;i++)
                output.write(i);
        }catch(Exception e) {

        }

        try(
                FileInputStream input = new FileInputStream("temp.dat");
        ){
            int value;
            while((value = input.read()) != -1)
                System.out.println(value + " ");
        }catch(Exception e) {

        }

    }

}
