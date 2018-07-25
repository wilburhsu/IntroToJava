package Chapter6;

/**
 * Created by ubuntu on 16-10-17.
 * RandomCharacter
 */
public class Code6_10 {
    public static char getRandomCharacter(char ch1,char ch2){
        return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
    }

    public static char getRandomLowerCaseLetter(){
        return getRandomCharacter('a','z');
    }

    public static char getRandomUpperCaseLetter() {
        return getRandomCharacter('A', 'Z');
    }

    public static char getRandomDigitCaseLetter() {
        return getRandomCharacter('0', '9');
    }

    public static char getRandomCharacter() {
        return getRandomCharacter('\u0000', '\uFFFF');
    }
}