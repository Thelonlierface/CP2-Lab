
import java.util.Scanner;

public class BackAndForth {

    public String reOrder(String s, boolean forward) {
        int len = s.length();
        if (len == 0) {
            return "";
        }
        if(forward) {
            if(s.charAt(0) != 'A') {
                return s.charAt(0) + reOrder(s.substring(1), true);
            }
            else {
                return s.charAt(0) + reOrder(s.substring(1), false);
            }
        }
        else {
            if (s.charAt(len - 1) != 'A') {
                return s.charAt(len - 1) + reOrder(s.substring(0, len - 1), false);
            } else {
                return s.charAt(len - 1) + reOrder(s.substring(0, len - 1), true);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        BackAndForth baf = new BackAndForth();
        String answer = baf.reOrder(s, true);
        System.out.print(answer);
    }
}
