import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String originalWord;

        System.out.println("Enter a word");
        originalWord = s.next();

        char letter1 = originalWord.charAt(0);
        int length = originalWord.length();
        char lastLetter = originalWord.charAt(length - 1);

        String pigLatinWord = (letter1 + lastLetter + "ay");

        System.out.println("Your original word, " + originalWord + ", converted to Pig Latin is “" + pigLatinWord + "”");
    }
}
