import java.util.Scanner;
import java.util.stream.IntStream;

public class Anagram2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		String[] s = new String[2];
        int[][] freq = new int[3][8];
        for (int i = 0; i < s.length; i++) {
            s[i] = input.nextLine();
            for (int j = 0; j < s[i].length(); ++j) {
                freq[i][s[i].charAt(j) - 65]++;
            }
            
        }
        for (int i = 0; i < 8; i++) {
            freq[2][i] = Math.abs(freq[0][i] - freq[1][i]);
        }
        for (int i = 0; i < freq.length; i++) {
            for (int j = 0; j < freq[i].length; j++) {
                System.out.print(freq[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(IntStream.of(freq[2]).sum() <= 3 ? "anagram" : "no");
		input.close();
    }
}
