import java.util.Scanner;

public class SubMatch2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
	    String s = input.nextLine();
        String target = input.nextLine();
        for (int i = 0; i < target.length() - 2; i++) {
            System.out.println(s.indexOf(target.substring(i, i + 3)) == -1 ? "No" : s.indexOf(target.substring(i, i + 3)) + 1);
        }
        input.close();
    }
}
