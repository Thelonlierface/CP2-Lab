
import java.util.Scanner;

public class RemoveAnyDup {
    String removeAnyDup(String str) {
        char ch0 = str.charAt(str.length() - 1);
        if(str.length() == 1) {
            return str;
        }
        if(str.indexOf(ch0) == str.lastIndexOf(ch0)) {
            return removeAnyDup(str.substring(0, str.length() - 1)) + ch0;
        }
        else {
            return removeAnyDup(str.substring(0, str.length() - 1));
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        RemoveAnyDup remover = new RemoveAnyDup();
        String result = remover.removeAnyDup(str);
        System.out.print(result);
    }
}