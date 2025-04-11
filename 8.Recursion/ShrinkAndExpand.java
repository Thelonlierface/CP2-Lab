import java.util.Scanner;

public class ShrinkAndExpand {
    String shrinkAndExpand(String s) {
        if(s.length() == 2) {
            if(s.charAt(0) == s.charAt(1)) {
                return Character.toString(s.charAt(0));
            }
            else {
                return Character.toString(s.charAt(0)) + Character.toString(s.charAt(0)) + Character.toString(s.charAt(1)) + Character.toString(s.charAt(1));
            }
        }
        else if(s.length() == 1 || s.length() == 0) {
            return s + s;
        }
        if(s.charAt(0) == s.charAt(1) && s.charAt(1) == s.charAt(2)){
            return Character.toString(s.charAt(0)) + shrinkAndExpand(s.substring(3));
        }
        else if(s.charAt(0) == s.charAt(1)) {
            return s.charAt(0) + shrinkAndExpand(s.substring(2));
        }
        else {
            return Character.toString(s.charAt(0)) + Character.toString(s.charAt(0)) + shrinkAndExpand(s.substring(1));
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        ShrinkAndExpand sae = new ShrinkAndExpand();
        String answer = sae.shrinkAndExpand(s);
        System.out.print(answer);
    }
}
