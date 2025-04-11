
import java.util.Scanner;

public class MinMerge {
    String merge(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        if(len1 == 0 || len2 == 0) {
            if(len1 > len2) {
                return str1;
            }
            else {
                return str2;
            }
        }
        else {
            if(str1.charAt(0) < str2.charAt(0)) {
                return str1.charAt(0) + merge(str1.substring(1), str2.substring(1));
            }
            else {
                return str2.charAt(0) + merge(str1.substring(1), str2.substring(1));
            }
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1 = scan.next();
        String str2 = scan.next();
        MinMerge merger = new MinMerge();
        System.out.println(merger.merge(str1, str2));
    }
}
