import java.util.Scanner;

public class CountBetween2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		String s = input.nextLine();
        int lowerCase = 0;
        int upperCase = 0;
        int others = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c >= 97 && c <= 122) lowerCase++;
            else if(c >= 65 && c <= 90) upperCase++;
            else others++;
        }
        input.close();
        System.out.println(lowerCase);
        System.out.println(upperCase);
        System.out.println(others);
    }
}
