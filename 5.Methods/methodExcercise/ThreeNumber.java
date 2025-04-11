import java.util.Arrays;
import java.util.Scanner;

public class ThreeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] num = new int[3];
        for (int i = 0; i < num.length; i++) {
            num[i] = input.nextInt();
        }
        int cmd = input.nextInt();
        switch (cmd) {
            case -1:
                System.out.println(Math.min(num[0], Math.min(num[1], num[2])));
                break;
            case 1:
                System.out.println(Math.max(num[0], Math.max(num[1], num[2])));
                break;
            case 0:
                Arrays.sort(num);
                System.out.println(num[1]);
                break;
        }
        input.close();
    }
}
