import java.util.Scanner;

public class Anagram1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		String s = input.nextLine();
        int[] freq = new int[8];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 65]++;
        }
        for (int i = 0; i < freq.length; i++) {
            System.out.print(freq[i] + " ");
        }
		input.close();
    }

}
