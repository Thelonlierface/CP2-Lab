import java.util.Scanner;

public class EqualDiffCharPair {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		String s = input.nextLine().trim();
        int n = input.nextInt();
        for (int i = 0; i < s.length() - 1; i++) {
            if(s.charAt(i) - s.charAt(i+1) == -n) {
                System.out.print((i+1) + " ");
                i++;
            }
        }
		input.close();
    }

}
