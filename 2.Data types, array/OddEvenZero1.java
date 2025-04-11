
import java.util.ArrayList;
import java.util.Scanner;

public class OddEvenZero1 {
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
        for (int odds : odd) {
            System.out.print(odds + " ");
        }
        System.out.println();
        for (int evens : even) {
            System.out.print(evens + " ");
        }
    }
}