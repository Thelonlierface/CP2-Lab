
import java.util.Scanner;

public class CutHalfRecursive {
    public static String cutHalf(String s) {
        int len = s.length();
        if(len == 1 || len == 0) {
            return s;
        }
        else {
            return s.charAt(len/2) + cutHalf(s.substring(0, len/2)) + cutHalf(s.substring(len/2+1, len));
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(cutHalf(str));
    }
}

//1234567890123456 
//ABCDEFGHIJKLMNOP