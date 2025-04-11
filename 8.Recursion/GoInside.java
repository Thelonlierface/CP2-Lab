import java.util.Scanner;

public class GoInside {
    String goInside(String str, boolean front) {
        int len = str.length();
        if(len == 1 || len == 0) {
            return str;
        }
        else {
            if(front) {
                return Character.toString(str.charAt(0)) + Character.toString(str.charAt(len - 1)) + goInside(str.substring(1, len - 1), false);
            }
            else {
                return Character.toString(str.charAt(len - 1)) + Character.toString(str.charAt(0)) + goInside(str.substring(1, len - 1), true);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        GoInside gi = new GoInside();
        String answer = gi.goInside(str, true);
        System.out.println(answer);
    }
}