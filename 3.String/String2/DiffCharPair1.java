import java.util.Scanner;

public class DiffCharPair1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		String s = input.nextLine();
        String next = input.nextLine();
        char c1 = next.charAt(0);
        char c2 = next.charAt(2);
        for (int i = 0; i < s.length(); i++) {
            int ioc1 = s.indexOf(c1, i);
            int ioc2 = s.indexOf(c2, i);
            if(Math.abs(ioc1 - ioc2) == 1) {
                if(ioc1 < ioc2 && ioc1 == i) {
                    System.out.print((ioc1 + 1) + " ");
                    i++;
                }
                else if(ioc1 > ioc2 && ioc2 == i) {
                    System.out.print((ioc2 + 1) + " ");
                    i++;
                }
            }
        }
		input.close();
    }
}