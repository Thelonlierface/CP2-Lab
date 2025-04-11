import java.util.Scanner;

public class TableQuery1 {
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
        int t = input.nextInt();
        int q = input.nextInt() - 1;
        switch (t) {
            case 1:
                if(q < 0 || q >= r) {
                    System.out.println("invalid Q");
                    break;
                }
                for (int i = 0; i < c; i++) {
                    System.out.print(arr[q][i] + " "); 
                }
                break;
            case 2:
                    if(q < 0 || q >= c) {
                        System.out.println("invalid Q");
                        break;
                    }
                    for (int i = 0; i < r; i++) {
                        System.out.println(arr[i][q] + " "); 
                    }
                break;
        }
    }
}
