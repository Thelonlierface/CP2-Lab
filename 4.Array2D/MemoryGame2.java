import java.util.Scanner;

public class MemoryGame2 {
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
        int[] res = new int[c];
        int count = 0;
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[j][i] == target) {
                    res[i]++;
                    count++;
                }
            }
        }
        for (int i = 0; i < res.length; i++) {
            if(res[i] != 0) {
                System.out.print(res[i] + " ");
            }
            else {
                System.out.print("* ");
            }
        }
        System.out.println();
        System.out.println(count);
    }
}
