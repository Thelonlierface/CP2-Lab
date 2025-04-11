
import java.util.Scanner;

public class ArrayJump1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        int index = 0;
        int sum = 1;
        for (int i = 0; i < 5; i++) {
            if(index >= n) {
                System.out.println("out of bounds");
                break;
            }
            System.out.println(sum + " " + arr[index]);
            sum += arr[index];
            index += arr[index];
        }
    }
}
