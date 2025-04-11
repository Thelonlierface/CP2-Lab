
import java.util.Scanner;

public class SMSEncode {
    public static void suEncode(String sentence, int ichar) {
        if(sentence.length() > 1) {
            int n1 = (int) sentence.charAt(0) - ichar;
            int n2 = (int) sentence.charAt(sentence.length() - 1) - sentence.charAt(0);
            System.out.println(n1 + " " + n2);
            suEncode(sentence.substring(1, sentence.length() - 1), sentence.charAt(0));
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SMSEncode se = new SMSEncode();
        String sentence = input.next();
        se.suEncode(sentence, 64);
    }
}
