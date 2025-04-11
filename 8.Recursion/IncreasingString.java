import java.util.Scanner;

public class IncreasingString {
    String makeIncreasingString(String str, char lastPrint) {
        int len = str.length();
        char c0 = str.charAt(0);
        if(len == 1) {
            if(c0 > lastPrint || c0 == 'A') {
                return str;
            }
            return "";
        }
        if(c0 > lastPrint) {
            return c0 + makeIncreasingString(str.substring(1), c0);
        }
        else {
            if(c0 == 'A') {
                return "A" + makeIncreasingString(str.substring(1), 'A');
            }
            return makeIncreasingString(str.substring(1), lastPrint);
        }
    }

    public static void main(String[] args) {
        IncreasingString inc = new IncreasingString();
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String result = inc.makeIncreasingString(str, 'A');
        System.out.print(result);
    }
}