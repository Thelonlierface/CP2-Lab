import java.util.Scanner;

public class AlternateChar {
    public String alterMerge(String s1, String s2, int order) {
        int len = s1.length();
        if(len == 0) {
            return "";
        }
        else if(order % 2 == 0) {
            return s2.charAt(0) + alterMerge(s1.substring(1), s2.substring(1), order + 1);
        }
        else if(order % 2 == 1) {
            return s1.charAt(0) + alterMerge(s1.substring(1), s2.substring(1), order + 1);
        }
        return "";
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s1 = input.next();
        String s2 = input.next();
        int order = input.nextInt();
        input.close();
        AlternateChar ac = new AlternateChar();
        String ans = ac.alterMerge(s1, s2, order);
        System.out.println(ans);
    }
}
