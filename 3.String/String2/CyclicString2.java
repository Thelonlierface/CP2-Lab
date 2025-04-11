import java.util.Scanner;

public class CyclicString2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        int n = input.nextInt();
        StringBuilder sb = new StringBuilder(s);
        StringBuilder init = new StringBuilder(s);
        init = init.reverse();
        do {
            sb.append(init);
            sb.append(s);
        } while (sb.length() < n);
        System.out.println(sb.substring(0, n));
        input.close();
    }
}
