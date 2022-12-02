import java.util.*;

public class CharArrayReversal {
    private char[] ch;

    // This method reverses contents of input argument array
    public char[] reverse(char[] ch) {
        char[] charArr = new char[ch.length];
        for (int i = ch.length - 1; i >= 0; i--) {
            charArr[ch.length - 1 - i] = ch[i];
        }
        return charArr;
    }

    public void setArr(char[] ch) {
        this.ch = ch;
    }

    public char[] getArr() {
        return ch;
    }

    public static void main(String[] args) {
        CharArrayReversal lettersObject = new CharArrayReversal();
        char[] ch = { 'a', 'b', 'c', 'd', 'e' };
        System.out.println("Starting character array:");
        lettersObject.setArr(ch);
        System.out.println(Arrays.toString(lettersObject.getArr()));

        lettersObject.setArr(lettersObject.reverse(ch));
        System.out.println("Reversed character array:");
        System.out.println(Arrays.toString(lettersObject.getArr()));
    }
}
