package Chapter7;

/**
 * Created by Wilbur Hsu on 2016/10/19.
 * LinearSearch
 */
public class Code7_6 {
    public static int linearSearch(int[] list,int key){
        for(int i=0; i <=list.length; i++){
            if(key == list[i])
                return i;
        }
        return -1;
    }
}
