import java.util.Scanner;

public class StringMerge1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] s = new String[2];
        for (int i = 0; i < s.length; i++) {
            s[i] = input.nextLine();
        }
        int n = input.nextInt();
        String res = "";
        int len = s[0].length() < s[1].length() ? s[0].length() : s[1].length();
        for (int i = 0; i < len; i++) {
            if ((Character.isLowerCase(s[0].charAt(i)) && Character.isLowerCase(s[1].charAt(i))) || (Character.isUpperCase(s[0].charAt(i)) && Character.isUpperCase(s[1].charAt(i)))) {
                res = res.concat(Character.toString(s[n - 1].charAt(i)));
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
