import java.util.Scanner;

public class SpellChecking1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String[] dict = new String[n];
        for (int i = 0; i < dict.length; i++) {
            dict[i] = input.next();
        }
        for (int i = 0; i < 10; i++) {
            String check = input.next();
            boolean match = false;
            for (int j = 0; j < dict.length; j++) {
                if(check.equals(dict[j])) {
                    match = true;
                    break;
                }
            }
            System.out.print(match ? 1 : 0);
        }
        input.close();
    }
}