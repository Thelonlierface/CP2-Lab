
import java.util.Scanner;

public class NoDivideByZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x = input.nextDouble();
        double y = input.nextDouble();
        double z = input.nextDouble();
        if(z == 0) {
            System.out.println("cannot divide by zero");
        }
        else {
            System.out.println(String.format("%.6f", (x+y)/z));
        }
    }
}