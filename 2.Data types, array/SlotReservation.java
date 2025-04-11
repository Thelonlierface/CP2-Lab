import java.util.Scanner;

public class SlotReservation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        int arr1[] = new int[n+1];
        int arr2[] = new int[n+1];
        int p = input.nextInt();
        for (int i = 0; i < p; i++) {
            int a = input.nextInt() - 1;
            if(arr1[a] < k) {
                arr1[a]++;
                System.out.println(1);
            }
            else {
                arr2[a]++;
                System.out.println(2);
            }
        }
        for (int i = 0; i < arr2.length - 1; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr2.length - 1; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}