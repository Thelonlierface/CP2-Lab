import java.util.Scanner;

public class NumReduction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        int m = input.nextInt();
        for (int i = 0; i < m; i++) {
            int index = input.nextInt() - 1;
            int pow = input.nextInt();
            for (int j = index - 2; j <= index + 2; j++) {
                if(j >= 0 && j < n) {
                    if(arr[j] > 0) {
                        arr[j] -= pow;
                        arr[j] = arr[j] >= 0 ? arr[j] : 0;
                    }
                }
            }
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
        input.close();
    }
}
