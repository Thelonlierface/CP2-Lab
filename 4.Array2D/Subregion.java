
import java.util.Scanner;

public class Subregion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r = input.nextInt();
        int c = input.nextInt();
        int p = input.nextInt() - 1;
        int q = input.nextInt() - 1;
        int width = input.nextInt();
        int height = input.nextInt();
        int[][] region = new int[r][c];
        if(p >= 0 && p + width <= r && q >= 0 && q + height <= c) {
            for (int i = p; i < p + width; i++) {
                for (int j = q; j < q + height; j++) {
                    region[i][j] = 1;
                }
            }
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    System.out.print(region[i][j] + " ");
                }
                System.out.println();
            }
        }
        else {
            System.out.println("invalid input");
        }
    }
}
