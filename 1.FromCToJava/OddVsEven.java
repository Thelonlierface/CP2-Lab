
import java.util.Scanner;

public class OddVsEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int odd = 0;
        int even = 0;
        for (int i = 0; i < 8; i++) {
            int num = input.nextInt();
            if (num % 2 == 0) even += num; else odd += num;
        }
        if(even == odd) {
            System.out.println("equal");
        }
        else if(even > odd) {
            System.out.println("even");
        }
        else {
            System.out.println("odd");
        }
        System.out.println(even);
        System.out.println(odd);
    }    
}
