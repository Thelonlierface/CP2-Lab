
import java.util.Scanner;

public class ArrayCompress2 {
    public boolean isDiv(int a, int[] div) {
        for (int j = 0; j < 3; j++) {
            if(a == div[j]) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayCompress2 ac2 = new ArrayCompress2();
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        int[] div = new int[3];
        for (int i = 0; i < 3; i++) {
            div[i] = input.nextInt();
        }
        int sum = 0;
        if (ac2.isDiv(arr[0], div)) {
            System.out.print(arr[0] + " ");
            sum = 0;
        } 
        else if (!ac2.isDiv(arr[0], div)) {
            sum += arr[0];
        }
        for (int i = 1; i < n; i++) {
            if(ac2.isDiv(arr[i], div) && !ac2.isDiv(arr[i-1], div)) {
                System.out.print(sum + " " + arr[i] + " ");
                sum = 0;
             }
            else if (!ac2.isDiv(arr[i], div)) {
                sum += arr[i];
            }
        }
        if(!ac2.isDiv(arr[n-1], div)) {
            System.out.print(sum);
        }
        input.close();
    }
}