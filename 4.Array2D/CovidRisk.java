import java.util.Scanner;

public class CovidRisk {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r = input.nextInt();
        int c = input.nextInt();
        int n = input.nextInt();
        int[][] arr = new int[r][c];
        
        for (int i = 0; i<n; ++i) {
            int x = input.nextInt() - 1;
            int y = input.nextInt() - 1;
            arr[x][y]++;
            for (int a = x-1; a <= x+1; ++a) {
                for (int b = y-1; b <= y+1 ; ++b) {
                    if(a < r && a >= 0 && b < c && b >= 0) arr[a][b]++;
                }
            }
        }
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int max = -1;
        for (int i = 1; i < arr.length - 1; i++) {
            for (int j = 1; j < arr[i].length - 1; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println(max);
        for (int i = 1; i < arr.length - 1; i++) {
            for (int j = 1; j < arr[i].length - 1; j++) {
                if (arr[i][j] == max) {
                    System.out.print((i + 1) + " ");
                    break;
                }
            }
        }
    }
}
