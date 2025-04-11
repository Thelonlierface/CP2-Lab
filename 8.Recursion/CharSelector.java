import java.util.Scanner;

public class CharSelector {
    String selectChar(String s, int[] k) {
        if (s.length() == 1) {
            return Character.toString(s.charAt(0));
        } else {
            int index = s.length() - ((k[s.length() - 1] % s.length()) + 1);
            return selectChar(s.substring(0, s.length() - 1), k) + s.charAt(index);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        final int N = s.length();
        int[] k = new int[N];
        for (int i = 0; i < N; ++i) {
            k[i] = scan.nextInt();
        }
        CharSelector selector = new CharSelector();
        String ans = selector.selectChar(s, k);
        System.out.println(ans);
    }
}
