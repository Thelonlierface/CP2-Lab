import java.util.Scanner;

public class StringExtremum1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int len = n == 2 ? Integer.MAX_VALUE : 0;
        String res = "";
        input.nextLine();
        while (true) {
            String s = input.nextLine();
            if(s.isEmpty()) {
                input.close(); 
                break;
            }
            if(n == 1) {
                if(s.length() >= len) {
                    len = s.length();
                    res = s;
                }
            }
            else {
                if(s.length() <= len) {
                    len = s.length();
                    res = s;
                }
            }
        }
        System.out.println(len);
        System.out.println(res);
    }
}