import java.util.Scanner;

public class AABBCC2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		String s = input.nextLine();
        int max = 1;
        int cont = 1;
        int tempL = -1;
        int l = -1;
        int r = -1;
        boolean start = true;
        for (int i = 0; i < s.length() - 1; i++) {
            if(s.charAt(i) - s.charAt(i + 1) == -1 || s.charAt(i) - s.charAt(i + 1) == 0) {
                cont++;
                if(start) {
                    tempL = i;
                    start = false;
                }
                if(cont > max) {
                    max = cont;
                    l = tempL;
                    r = i;
                }
            }
            else {
                cont = 1;
                start = true;
            }
        }
        System.out.println(max);
        System.out.println(s.substring(l, r+2));
		input.close();
    }
}
