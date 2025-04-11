
import java.util.Scanner;

public class RecursiveAdd {
    static String add(String x, String y, int order, int inc) {
        //int num_x = Integer.parseInt(Character.toString(x.charAt(x.length() - 1)));
        //int num_y = Integer.parseInt(Character.toString(y.charAt(y.length() - 1)));
        int num_x = Character.getNumericValue(x.charAt(x.length() - 1));
        int num_y = Character.getNumericValue(y.charAt(y.length() - 1));
        int sum = num_x + num_y + inc;
        int rem = sum/10;
        if(x.length() == 1) {
            return Integer.toString(sum);
        }
        else {
            return add(x.substring(0, x.length() - 1), y.substring(0, y.length() - 1), order + 1, rem) + Integer.toString(sum%10);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        RecursiveAdd ra = new RecursiveAdd();
        String x = input.next();
        String y = input.next();
        System.out.println(ra.add(x, y, 0, 0));
    }
}
