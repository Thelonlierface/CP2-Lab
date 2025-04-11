import java.util.Scanner;

public class Partition1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] <= arr[(n-1)/2]) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[(n - 1) / 2]) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
