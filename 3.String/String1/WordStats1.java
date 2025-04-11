import java.util.Scanner;

public class WordStats1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] freq = new int[26];
        for (int i = 0; i < n; i++) {
            String s = input.next();
            freq[s.charAt(0) - 65]++;
        }
        for (int i = 0; i < freq.length; i++) {
            if(freq[i] != 0) System.out.println((char) (i + 65) + " " + freq[i]);
        }
		input.close();
    }
}
