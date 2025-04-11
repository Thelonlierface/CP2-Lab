
import java.util.Scanner;

public class SukunaFinger {
    public int oneDigit(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num%10;
            num /= 10;
        }
        String s = Integer.toString(sum);
        if(s.length() == 1) {
            return sum;
        }
        else {
            return oneDigit(sum);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SukunaFinger sf = new SukunaFinger();
        int l = 0;
        int r = 0;
        int jubutsu = 0;
        while (true) { 
            int item = input.nextInt();
            if(item <= 0) {
                input.close();
                break;
            }
            else if(item > 999 || item < 100 || l + r >= 20) {
                System.out.println("JUBUTSU !");
                jubutsu++;
                continue;
            }
            
            int sum = sf.oneDigit(item);
            if(sum % 2 == 0) {
                r++;
            }
            else {
                l++;
            }
        }
        System.out.println("Sukuna's right finger " + r);
        System.out.println("Sukuna's left finger " + l);
        System.out.println("Sukuna's finger " + (l + r));
        System.out.println("jubutsu " + jubutsu);
    }
}