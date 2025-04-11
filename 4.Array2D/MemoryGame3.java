import java.util.Scanner;

public class MemoryGame3 {
    public int findTotal(int[][] arr, int target, int x, int y) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][y] == target) {
                total++;
            }
        }
        for (int i = 0; i < arr[x].length; i++) {
            if (arr[x][i] == target) {
                total++;
            }
        }
        return total;
    }
    public int countMax(int[][] arr, int max) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == max) {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        MemoryGame3 mg = new MemoryGame3();
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
        int max = -1;
        int[][] res = new int[r][c];
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[i].length; j++) {
                res[i][j] = mg.findTotal(arr, target, i, j);
                if(arr[i][j] == target) {
                    res[i][j]--;
                }
                if (res[i][j] > max) {
                    max = res[i][j];
                }
            }
        }
        // for (int i = 0; i < res.length; i++) {
        //     for (int j = 0; j < res[i].length; j++) {
        //         System.out.print(res[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        System.out.println(max);
        System.out.println(mg.countMax(res, max));
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[i].length; j++) {
                if(res[i][j] == max) {
                    System.out.println((i + 1) + " " + (j + 1));
                }
            }
        }
    }
}
