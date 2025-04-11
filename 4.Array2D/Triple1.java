import java.util.Scanner;

public class Triple1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r = input.nextInt();
        int c = input.nextInt();
        int[][] arr = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = input.nextInt();
            }
        }
        int target = input.nextInt();
        int count = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                int a = arr[i][j];
                if(a == target) {
                    count++;
                    if(count == 3) {
                        System.out.print((i+1) + " ");
                        count = 0;
                        break;
                    }
                }
                else {
                    count = 0;
                }
            }
            count = 0;
        }
    }
}
