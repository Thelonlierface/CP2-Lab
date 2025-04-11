import java.util.Scanner;

public class StringMerge2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] s = new String[2];
        for (int i = 0; i < s.length; i++) {
            s[i] = input.next();
        }
        String res = "";
        int len = s[0].length() < s[1].length() ? s[0].length() : s[1].length();
        for (int i = 0; i < len; i++) {
            boolean s1IsBracket = s[0].charAt(i) == '(' || s[0].charAt(i) == ')' || s[0].charAt(i) == '{' || s[0].charAt(i) == '}';
            boolean s2IsBracket = s[1].charAt(i) == '(' || s[1].charAt(i) == ')' || s[1].charAt(i) == '{' || s[1].charAt(i) == '}';
            if ((Character.isLowerCase(s[0].charAt(i)) && Character.isLowerCase(s[1].charAt(i))) || (Character.isUpperCase(s[0].charAt(i)) && Character.isUpperCase(s[1].charAt(i))) 
            || (Character.isDigit(s[0].charAt(i)) && Character.isDigit(s[1].charAt(i))) || (s1IsBracket && s2IsBracket)) {
                res = res.concat(Character.toString(s[0].charAt(i)));
            }
            else if (s1IsBracket) {
                res = res.concat(Character.toString(s[0].charAt(i)));
            } else if (s2IsBracket) {
                res = res.concat(Character.toString(s[1].charAt(i)));
            }
            else if (Character.isDigit(s[0].charAt(i))) {
                res = res.concat(Character.toString(s[0].charAt(i)));
            } else if (Character.isDigit(s[1].charAt(i))) {
                res = res.concat(Character.toString(s[1].charAt(i)));
            }
            else if (Character.isUpperCase(s[0].charAt(i))) {
                res = res.concat(Character.toString(s[0].charAt(i)));
            }
            else if (Character.isUpperCase(s[1].charAt(i))) {
                res = res.concat(Character.toString(s[1].charAt(i)));
            }
        }
        input.close();
        System.out.println(res);
    }
}
