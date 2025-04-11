import java.util.Scanner;

public class box2 {
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
            if(command == 1) {
                int boxNum = input.nextInt();
                boxNum--;
                if(itemsInBox[boxNum] + amount <= boxSize[boxNum]) {
                    itemsInBox[boxNum] += amount;
                    System.out.println(itemsInBox[boxNum]);
                }
                else {
                    System.out.println(-1);
                }
            }
            else if (command == 2) {
                int j = 0;
                while(true) {
                    if(itemsInBox[j] >= amount) {
                        itemsInBox[j] -= amount;
                        System.out.println((j+1) + " " + itemsInBox[j]);
                        break;
                    }
                    else {
                        amount -= itemsInBox[j];
                        itemsInBox[j] = 0;
                        j++;
                        if(j == n) {
                            System.out.println((j) + " " + itemsInBox[j-1]);
                            break;
                        }
                    }
                }
            }
        }
        input.close();
    }
}
