import java.util.Scanner;

public class AABBCC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		String s = input.nextLine();
        int max = 1;
        int cont = 1;
        for (int i = 0; i < s.length() - 1; i++) {
            if(s.charAt(i) - s.charAt(i + 1) == -1 || s.charAt(i) - s.charAt(i + 1) == 0) {
                cont++;
                max = cont > max ? cont : max;
            }
            else {
                cont = 1;
            }
        }
        System.out.println(max);
		input.close();
    }
}
