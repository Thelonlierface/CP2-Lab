import java.util.Scanner;

public class EncodingAlphabetWithNumber {
    public String encode(String code, int[] enc) {
        if(code.length() == 1) {
            return Character.toString((char)(code.charAt(0) + enc[enc.length - 1]));
        }
        else {
            return Character.toString((char)(((code.charAt(0) + enc[enc.length - code.length()])-65)%26+65)) + encode(code.substring(1, code.length()), enc);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        int[] move = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            move[i] = input.nextInt();
        }
        EncodingAlphabetWithNumber e = new EncodingAlphabetWithNumber();
        System.out.println(e.encode(s, move));
        input.close();
    }
}