import java.util.Scanner;

public class DiffCharPair2 {
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
                if(ioc1 < ioc2 && ioc1 == i) { // c1 then c2
                    char checkL = ioc1 - 1 < 0 ? ' ' : s.charAt(ioc1 - 1);
                    char checkR = ioc2 + 1 >= s.length() ? ' ' : s.charAt(ioc2 + 1);
                    if(checkL != c1 && checkL != c2 && checkR != c1 && checkR != c2) {
                        System.out.print((ioc1 + 1) + " ");
                        i++;
                    }
                    
                }
                else if(ioc1 > ioc2 && ioc2 == i) { //c2 then c1
                    char checkL = ioc2 - 1 < 0 ? ' ' : s.charAt(ioc2 - 1);
                    char checkR = ioc1 + 1 >= s.length() ? ' ' : s.charAt(ioc1 + 1);
                    if(checkL != c1 && checkL != c2 && checkR != c1 && checkR != c2) {
                        System.out.print((ioc2 + 1) + " ");
                        i++;
                    }
                }
            }
        }
		input.close();
    }
}
