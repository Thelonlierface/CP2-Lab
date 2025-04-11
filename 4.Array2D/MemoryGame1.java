import java.util.Scanner;

public class MemoryGame1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r = input.nextInt();
        int c = input.nextInt();
        int[][] arr = new int[r][c];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = input.nextInt();
            }
        }
        int target = input.nextInt();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j] == target) {
                    System.out.print(target + " ");
                }
                else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
