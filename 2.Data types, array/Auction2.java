import java.util.Scanner;

public class Auction2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] basePrice = new int[n];
        for (int i = 0; i < basePrice.length; i++) {
            basePrice[i] = input.nextInt();
        }
        int rounds = input.nextInt();
        int[] repeatCheck = new int[n];
        for (int i = 0; i < repeatCheck.length; i++) {
            repeatCheck[i] = 0;
        }
        for (int i = 0; i < rounds; ++i) {
            for (int j = 0; j < basePrice.length; j++) {
                int offer = input.nextInt(); 
                if(offer <= basePrice[j]) {
                    System.out.print(basePrice[j] + " ");
                    repeatCheck[j]++;
                }
                else if (offer > basePrice[j]) {
                    if(repeatCheck[j] < 3) {
                        basePrice[j] = offer;
                        repeatCheck[j] = 0;
                        System.out.print(basePrice[j] + " ");
                    }
                    else {
                        System.out.print(basePrice[j] + " ");
                    }
                }
            }
            System.out.println();
        }
        input.close();
    }
}
