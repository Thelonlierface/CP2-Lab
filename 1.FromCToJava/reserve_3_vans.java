import java.util.Scanner;

public class reserve_3_vans {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a = 0;
        int b = 0;
        int c = 0;
        for (int i = 0; i < n; ++i) {
            int res = input.nextInt();
            if (a <= b && a <= c) {
                System.out.println("A");
                a += res;
            } else if (b <= c) {
                System.out.println("B");
                b += res;
            } else {
                System.out.println("C");
                c += res;
            }
        }

    }
}