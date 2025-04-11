
import java.util.Scanner;

public class NumTable1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r = input.nextInt();
        int c = input.nextInt();
        int[][] arr = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = input.nextInt();
            }
        }
        int k = input.nextInt();
        for (int i = 0; i < k; i++) {
            int x = input.nextInt() - 1;
            int y = input.nextInt() - 1;
            if (x >= 0 && x < r && y >= 0 && y < c) {
                System.out.print(arr[x][y]);
            }
            else {
                System.out.print("-");
            }
        }
    }
}
