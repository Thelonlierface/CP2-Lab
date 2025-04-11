
import java.util.Scanner;

public class Auction1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] basePrice = new int[n];
        for (int i = 0; i < basePrice.length; i++) {
            basePrice[i] = input.nextInt();
        }
        int rounds = input.nextInt();
        for(int i = 0; i<rounds; ++i) {
            for (int j = 0; j < basePrice.length; j++) {
                int offer = input.nextInt();
                if(offer < basePrice[j]) {
                    System.out.print(basePrice[j] + " ");
                }
                else {
                    basePrice[j] = offer;
                    System.out.print(basePrice[j] + " ");
                }
            }
            System.out.println();
        }
    }
}
