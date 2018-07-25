package Chapter6;

/**
 * Created by ubuntu on 16-10-17.
 * TestRandomCharacter
 */
public class Code6_11 {
    public static void main(String[] args) {
        final int NUMBER_OF_CHARS = 175;
        final int CHAR_PER_LINE = 25;

        for (int i = 0;i < NUMBER_OF_CHARS;i++){
            char ch = Code6_10.getRandomUpperCaseLetter();
            if ((i + 1) % CHAR_PER_LINE == 0)
                System.out.println(ch);
            else
                System.out.print(ch);
        }
    }
}