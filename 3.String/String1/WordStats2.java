import java.util.Arrays;
import java.util.Scanner;

public class WordStats2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] freq = new int[26];
        int[] max = new int[26];
        int[] min = new int[26];
        Arrays.fill(min, Integer.MAX_VALUE);
        for (int i = 0; i < n; i++) {
            String s = input.next();
            freq[s.charAt(0) - 65]++;
            if (s.length() > max[s.charAt(0) - 65]) max[s.charAt(0) - 65] = s.length();
            if (s.length() < min[s.charAt(0) - 65]) min[s.charAt(0) - 65] = s.length();
        }
        for (int i = 0; i < freq.length; i++) {
            if(freq[i] != 0) System.out.println((char) (i + 65) + " " + min[i] + " " + max[i]);
        }
		input.close();
    }
}
