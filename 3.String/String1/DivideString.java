import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DivideString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		String s = input.nextLine();
        ArrayList<Character> lowerCase = new ArrayList<>();
        ArrayList<Character> upperCase = new ArrayList<>();
        ArrayList<Character> others = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 97 && c <= 122)
                lowerCase.add(c);
            else if (c >= 65 && c <= 90)
                upperCase.add(c);
            else
                others.add(c);
        }
        ArrayList<ArrayList<Character>> res = new ArrayList<>(Arrays.asList(lowerCase, upperCase, others));
        for (ArrayList<Character> al : res) {
            for (char c : al) {
                System.out.print(c);
            }
            System.out.println();
        }
        input.close();
    }
}
