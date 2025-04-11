import java.util.Scanner;

public class Triple2 {
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
            boolean hasFirstValue = false;
            for (int j = 0; j < c; j++) {
                int a = arr[i][j];
                if(a == target) {
                    count++;
                    if(count == 3) {
                        System.out.print((j-1) + " ");
                        hasFirstValue = true;
                        break;
                    }
                }
                else {
                    count = 0;
                }
            }
            count = 0;
            if(!hasFirstValue) {
                System.out.println(0);
                continue;
            }
            for (int j = c - 1; j >= 0; --j) {
                int a = arr[i][j];
                if (a == target) {
                    count++;
                    if (count == 3) {
                        System.out.print(j + 1);
                        count = 0;
                        break;
                    }
                } else {
                    count = 0;
                }
            }
            System.out.println();
        }
    }
}
