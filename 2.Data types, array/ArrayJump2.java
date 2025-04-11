import java.util.Scanner;

public class ArrayJump2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        int index = input.nextInt();
        index--;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        int sum = arr[index];
        while (true){
            if (index >= n) {
                System.out.println("out of bounds");
                break;
            }
            System.out.println((index + 1) + " " + arr[index]);
            sum += arr[index];
            index += arr[index];
        }
    }
}
