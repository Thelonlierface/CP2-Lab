import java.util.Scanner;

public class ABC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		String s = input.nextLine();
        int count = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            boolean cont = true;
            for (int j = i; j < i + 2; j++) {
                if(s.charAt(j+1) - s.charAt(j) != 1) {
                    cont = false;
                    break;
                }
            }
            if(cont) count++;
        }
        System.out.println(count);
		input.close();
    }
}
