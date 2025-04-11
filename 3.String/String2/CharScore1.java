import java.util.Scanner;

public class CharScore1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		String s = input.nextLine();
        int div = s.length()/2;
        int l = 0;
        int r = 0;
        for (int i = 0; i < div; i++) {
            l += s.charAt(i) - 64;
        }
        for (int i = div; i < s.length(); i++) {
            r += s.charAt(i) - 64;
        }
        System.out.println(l);
        System.out.println(r);
		input.close();
    }

}
