
import java.util.Scanner;

public class ConsecDupRemoval {
    String dupRemove(String str) {
        if(str.length() == 1) {
            return str;
        }
        if(str.charAt(str.length() - 1) != str.charAt(str.length() - 2)) {
            return dupRemove(str.substring(0, str.length() - 1)) + str.charAt(str.length() - 1);
        }
        else {
            return dupRemove(str.substring(0, str.length() - 1));
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String result = (new ConsecDupRemoval()).dupRemove(str);
        System.out.print(result);
    }
}