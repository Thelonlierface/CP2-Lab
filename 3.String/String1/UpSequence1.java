import java.util.Scanner;

public class UpSequence1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		String s = input.nextLine();
        for (int i = 0; i < s.length() - 1; i++) {
            if(s.charAt(i+1) <= s.charAt(i)) System.out.println(s.charAt(i));
            if(i == s.length() - 2) System.out.println(s.charAt(i+1));
        }
        input.close();
    }
}
