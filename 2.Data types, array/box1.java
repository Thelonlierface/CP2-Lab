
import java.util.Scanner;

public class box1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] boxSize = new int[n];
        int[] itemsInBox = new int[n];
        for (int i = 0; i < itemsInBox.length; i++) {
            boxSize[i] = input.nextInt();
            itemsInBox[i] = 0;
        }
        int k = input.nextInt();
        for (int i = 0; i < k; i++) {
            int command = input.nextInt();
            int amount = input.nextInt();
            int boxNum = input.nextInt();
            boxNum--;
            if(command == 1) {
                if(itemsInBox[boxNum] + amount <= boxSize[boxNum]) {
                    itemsInBox[boxNum] += amount;
                    System.out.println(itemsInBox[boxNum]);
                }
                else {
                    System.out.println(-1);
                }
            }
            else if (command == 2) {
                if(itemsInBox[boxNum] - amount >= 0) {
                    itemsInBox[boxNum] -= amount;
                    System.out.println(itemsInBox[boxNum]);
                }
                else {
                    System.out.println(-1);
                }
            }
        }
        input.close();
    }
}
