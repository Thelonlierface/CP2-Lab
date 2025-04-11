import java.util.Scanner;

public class CharAt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        int n = input.nextInt() - 1;
        if (n >= 0 && n < s.length()) System.out.println(s.charAt(n));
        else System.out.println("invalid position");
        input.close();
    }
}