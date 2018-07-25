package Chapter7;

/**
 * Created by Wilbur Hsu on 2016/10/19.
 * CountLettersInArray
 */
public class Code7_4 {
    public static void main(String[] args) {

        char[] chars = creatArray();

        System.out.println("The lowercase letters are: ");
        displayArray(chars);

        int[] counts = countLetters(chars);

        System.out.println();
        System.out.println("The occurences of each letters are：");

        displayCounts(counts);


    }

    private static char[] creatArray() {
        char[] chars = new char[100];

        for(int i=0; i<chars.length; i++)
            chars[i] = (char)('a' + Math.random()*('z' - 'a' + 1));//随机生成小写字母
        return chars;
    }

    private static void displayArray(char[] chars) {
        for(int i=0; i<chars.length; i++)
            if ((i + 1) % 20 == 0)
                System.out.println(chars[i]);
            else
                System.out.print(chars[i] + " ");
    }

    private static int[] countLetters(char[] chars) {
        int[] counts = new int[26];

        for(int i=0; i<chars.length; i++)
            counts[chars[i] - 'a']++;
        return counts;
    }

    private static void displayCounts(int[] counts) {
        for(int i=0; i<counts.length; i++){
            if((i + 1) % 10 == 0)
                System.out.println(counts[i] + " " + (char)(i + 'a'));
            else
                System.out.print(counts[i] + " " + (char)(i + 'a') + " ");
        }
    }


}
