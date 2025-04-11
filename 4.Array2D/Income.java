import java.util.Scanner;

public class Income {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r = input.nextInt();
        int c = input.nextInt();
        int[][] region = new int[r][c];
        int n = input.nextInt();
        for (int a = 0; a < n; ++a) {
            int p = input.nextInt() - 1;
            int q = input.nextInt() - 1;
            int width = input.nextInt();
            int height = input.nextInt();
            boolean isEmpty = true;
            if (p >= 0 && p + width <= r && q >= 0 && q + height <= c) {
                for (int i = p; i < p + width; i++) {
                    for (int j = q; j < q + height; j++) {
                        if (region[i][j] == 1) {
                            isEmpty = false;
                            break;
                        }
                    }
                    if (!isEmpty) {
                        break;
                    }
                }
                if (isEmpty) {
                    for (int i = p; i < p + width; i++) {
                        for (int j = q; j < q + height; j++) {
                            if (region[i][j] == 0) {
                                region[i][j] = 1;
                            }
                        }
                    }
                }
            }
        }
        int[][] price = new int[r][c];
        int totalPrice = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                price[i][j] = input.nextInt();
                totalPrice += region[i][j] == 1 ? price[i][j] : 0;
            }
        }
        System.out.println(totalPrice);
        input.close();
    }
}
