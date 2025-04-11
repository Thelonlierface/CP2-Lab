import java.util.Scanner;

public class CropAround {
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
        int x = input.nextInt();
        int y = input.nextInt();
        int width = input.nextInt();
        int length = input.nextInt();
        if(x < 0 || y < 0 || x >= r || y >= c) {
            System.out.println("invalid");
            System.exit(x);
        }
        for (int i = x - width/2; i <= x + width/2; i++) {
            for (int j = y - length/2; j <= y + length/2; j++) {
                if(i < 0 || j < 0 || i >= r || j >= c) {
                    continue;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        input.close();
    }
}