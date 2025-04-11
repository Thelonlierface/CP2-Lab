import java.util.ArrayList;
import java.util.Scanner;

public class OddEvenZero2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        for (int i = 0; i<n; ++i) {
            int num = input.nextInt();
            if(num == 0) {
                odd.add(num);
                even.add(num);
            }
            else if(num % 2 == 0) {
                even.add(num);
            }
            else {
                odd.add(num);
            }
        }
        input.close();
        int max = 0;
        for (int odds : odd) {
            if(odds == 0) {
                max = 0;
                System.out.print(0 + " ");
            }
            else if(odds > max) {
                System.out.print(odds + " ");
                max = odds;
            }
        }
        System.out.println();
        max = 0;
        for (int evens : even) {
            if (evens == 0) {
                max = 0;
                System.out.print(0 + " ");
            } 
            else if (evens > max) {
                System.out.print(evens + " ");
                max = evens;
            }
        }
    }
}
