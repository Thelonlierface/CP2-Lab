import java.util.Scanner;

public class Labor {
    static void getPrice(int[] price, final int K, final int M) {
        int sum = 0;
        int l = M - 1 - ((K - 1) / 2);
        int r = M - 1 + ((K - 1) / 2);
        if (l < 0 || r > price.length - 1) {
            l = l < 0 ? 0 : l;
            r = r > price.length - 1 ? price.length - 1 : r;
            for (int i = l; i <= r; ++i) {
                sum += price[i];
            }
            System.out.print("no " + sum);
        } else {
            for (int i = l; i <= r; i++) {
                sum += price[i];
            }
            System.out.print(sum);
        }
    }
    
    static void isLaborReady(int[] labor, final int K, final int M) {
        int l = M - 1 - ((K - 1) / 2);
        int r = M - 1 + ((K - 1) / 2);
        if (l >= 0 && r <= labor.length - 1){
            boolean laborReady = true;
            for (int i = l; i <= r; i++) {
                if(labor[i] < 5) {
                    laborReady = false;
                }
            }
            if(laborReady) {
                System.out.println(" labor");
            }
            else {
                System.out.println();
            }
        }
        else {
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] price = new int[n];
        for (int i = 0; i < price.length; i++) {
            price[i] = input.nextInt();
        }
        int[] labor = new int[n];
        for (int i = 0; i < labor.length; i++) {
            labor[i] = input.nextInt();
        }
        final int q = input.nextInt();
        for (int i = 0; i < q; ++i) {
            final int K = input.nextInt();
            final int M = input.nextInt();
            getPrice(price, K, M);
            isLaborReady(labor, K, M);
        }
    }
}
