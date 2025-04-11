import java.util.Scanner;

public class TargetLand {
    static void getPrice(int[] price, final int K, final int M) {
        int sum = 0;
        int l = M - 1 - ((K - 1) / 2);
        int r = M - 1 + ((K - 1) / 2);
        if (l < 0 || r > price.length - 1) {
            System.out.println("no");
        } else {
            for (int i = l; i <= r; i++) {
                sum += price[i];
            }
            System.out.println(sum);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] price = new int[n];
        for (int i = 0; i < price.length; i++) {
            price[i] = input.nextInt();
        }
        int q = input.nextInt();
        for(int i = 0; i<q; ++i) {
            final int K = input.nextInt();
            final int M = input.nextInt();
            getPrice(price, K, M);
        }
    }
}

