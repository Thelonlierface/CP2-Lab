import java.util.Scanner;

public class TableQuery2 {
    public int makeMyIndicesValid(int given, int correct) {
        given--;
        given = given >= correct ? correct - 1 : given;
        given = given < 0 ? 0 : given;
        return given;
    }
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
        TableQuery2 tq = new TableQuery2();
        // start (a, p) end (b, q)
        int a = tq.makeMyIndicesValid(input.nextInt() - 1, r);
        int b = tq.makeMyIndicesValid(input.nextInt() - 1, r);
        int p = tq.makeMyIndicesValid(input.nextInt() - 1, c);
        int q = tq.makeMyIndicesValid(input.nextInt() - 1, c);
        //System.out.println(a + " " + b + " " + p + " " + q);
        for (int i = a; i<=b; ++i) {
            for (int j = p; j<=q; ++j) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

