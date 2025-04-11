
import java.util.Scanner;

public class OperSelect {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        int oper = input.nextInt();
        switch (oper) {
            case 1:
                System.out.println(x + y);
                break;
            case 2:
                System.out.println(x - y);
                break;
            case 3:
                System.out.println(x * y);
                break;
            case 4:
                if (y != 0) {
                    System.out.println(x / y);
                } 
                else {
                    System.out.println("cannot divide by zero");
                }
                break;
            case 5:
                if (y != 0) {
                    System.out.println(x % y);
                }
                else {
                    System.out.println("cannot divide by zero");
                }
                break;
        }
        input.close();
    }
}
