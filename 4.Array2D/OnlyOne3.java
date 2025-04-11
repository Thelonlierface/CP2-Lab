import java.util.Scanner;

public class OnlyOne3 {
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
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        OnlyOne3 o = new OnlyOne3();
        int r = input.nextInt();
        int c = input.nextInt();
        int[][] arr = new int[r][c];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = input.nextInt();
            }
        }
        int rf = input.nextInt() - 1;
        int cf = input.nextInt() - 1;
        cf = cf >= c ? c - 1 : cf;
        cf = cf < 0 ? 0 : cf;
        rf = rf >= r ? r - 1 : rf;
        rf = rf < 0 ? 0 : rf;
        int total = arr[rf][cf] == 1 ? o.findTotal(arr, 1, rf, cf) - 1 : o.findTotal(arr, 1, rf, cf);
        System.out.println(total);
    }
}
