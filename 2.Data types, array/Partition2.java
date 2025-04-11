
import java.util.Scanner;

public class Partition2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        int[] res = new int[n];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= arr[(n - 1) / 2]) {
                res[count] = arr[i];
                count++;
            }
        }
        for (int i = 0; i < count; i++) {
            if(res[i] <= res[count/2]) {
                System.out.print(res[i] + " ");
            }
        }
        System.out.println();
        for (int i = 0; i < count; i++) {
            if (res[i] > res[count / 2]) {
                System.out.print(res[i] + " ");
            }
        }
    }
}
