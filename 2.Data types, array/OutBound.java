
import java.util.Scanner;

public class OutBound {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        int a = input.nextInt();
        int b = input.nextInt();
        boolean hasOutOfBound = false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < a || arr[i] > b) {
                System.out.print(arr[i] + " ");
                hasOutOfBound = true;
            }
        }
        if(!hasOutOfBound) {
            System.out.println("no data");
        }
    }
}
