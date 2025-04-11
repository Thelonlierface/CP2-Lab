import java.util.Scanner;

public class CyclicString1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		String s = input.nextLine();
        int n = input.nextInt();
        StringBuilder sb = new StringBuilder(s);
        do {
            sb.append(s);
        } while(sb.length() < n);
        System.out.println(sb.substring(0, n));
		input.close();
    }
}
