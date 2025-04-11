import java.util.Scanner;

public class KeepTwo {
    String keepTwo(String str) {
        char n = str.charAt(str.length() - 1);
        String nStr = str.substring(0, str.length() - 1);
        if (str.length() == 1) {
            //System.out.println(str);
            return str;
        }
        if (nStr.indexOf(n) == nStr.lastIndexOf(n)) {
            //System.out.println(nStr + " " + Character.toString(n) + " " + nStr.indexOf(n) + ", " + nStr.lastIndexOf(n));
            return keepTwo(nStr) + Character.toString(n);
        } else {
            //System.out.println(nStr + "   " + nStr.indexOf(n) + ", " + nStr.lastIndexOf(n));
            return keepTwo(nStr);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        KeepTwo kt = new KeepTwo();
        String answer = kt.keepTwo(str);
        System.out.print(answer);
    }
}