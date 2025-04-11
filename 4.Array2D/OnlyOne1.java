import java.util.Scanner;

public class OnlyOne1 {
    public int countCol(int[][] arr, int c) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][c] == 1) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        OnlyOne1 o = new OnlyOne1();
        int r = input.nextInt();
        int c = input.nextInt();
        int[][] arr = new int[r][c];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = input.nextInt();
            }
        }
        int[] res = new int[c];
        int max = -1;
        int maxIndex = -1;
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                res[i] = o.countCol(arr, i);
                if (res[i] > max) {
                    max = res[i];
                    maxIndex = i;
                }
                else if(res[i] == max) {
                    maxIndex = i;
                }
            }
        }
        System.out.println(max);
        System.out.println(maxIndex + 1);
    }
}
