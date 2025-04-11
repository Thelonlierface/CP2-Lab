import java.util.Scanner;

public class AtoZ1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		String s = input.nextLine();
        int l = s.indexOf('A') < s.indexOf('Z') ? s.indexOf('A') : s.indexOf('Z');
        int r = s.indexOf('A') > s.indexOf('Z') ? s.indexOf('A') : s.indexOf('Z');
        boolean reverse = s.indexOf('A') > s.indexOf('Z');
        if(!reverse) {
            for (int i = l; i < r+1; i++) {
                System.out.print(s.charAt(i));
            }
        }
        else {
            for (int i = r; i >= l; i--) {
                System.out.print(s.charAt(i));
            }
        }
        input.close();
    }
}