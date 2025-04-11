import java.util.Scanner;

public class UpSequence0 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		int n = input.nextInt();
        int prev = input.nextInt();
        for (int i = 0; i < n - 1; i++) {
            int cur = input.nextInt();
            if(prev >= cur) System.out.println(prev);
            prev = cur;
            if(i == n-2) System.out.println(cur);
        }
        input.close();
    }
}
