import java.util.Scanner;

public class ConsecSale {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int p = input.nextInt();
        int k = input.nextInt();
        int currConsecSale = 0;
        int maxConsecSale = 0;
        int condoSold = 0;
        for (int i = 0; i < k; ++i) {
            int order = input.nextInt();
            if (order > n && order < p) {
                currConsecSale++;
                condoSold++;
                if (currConsecSale > maxConsecSale) {
                    maxConsecSale = currConsecSale;
                }
            } else {
                currConsecSale = 0;
            }
        }
        System.out.println(condoSold);
        System.out.println(maxConsecSale);
        input.close();
    }
}
