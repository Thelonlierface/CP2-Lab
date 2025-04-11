
import java.util.Scanner;

public class InBound {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] data = new int[n];
        for (int i = 0; i < data.length; i++) {
            data[i] = input.nextInt();
        }
        int a = input.nextInt();
        int b = input.nextInt();
        boolean hasData = false;
        for (int num : data) {
            if(num >= a && num <= b) {
                System.out.print(num + " ");
                hasData = true;
            }
        }
        input.close();
        if(!hasData) {
            System.out.println("no data");
        }
    }
}
