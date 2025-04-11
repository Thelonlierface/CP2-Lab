import java.util.Scanner;

public class ShootCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r = input.nextInt();
        int c = input.nextInt();
        int k = input.nextInt();
        int inBounds = 0;
        int outBounds = 0;
        for (int i = 0; i < k; i++) {
            int x = input.nextInt();
            int y = input.nextInt();
            if(x > 0 && x <= r && y > 0 && y <= c) {
                inBounds++;
            }
            else {
                outBounds++;
            }
        }
        System.out.println(inBounds);
        System.out.println(outBounds);
    }
}
