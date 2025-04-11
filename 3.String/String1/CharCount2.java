import java.util.Scanner;

public class CharCount2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] count = new int[26];
        int inputCount = 0;
        while (true) {
            String s = input.nextLine();
            for (int i = 0; i < s.length(); i++) {
                count[s.charAt(i) - 65]++;
                if (count[s.charAt(i) - 65] >= n) {
                    System.out.println(s.charAt(i));
                    System.out.println(inputCount);
                    input.close();
                    System.exit(i);
                }
            }
            inputCount++;
        }
    }
}
