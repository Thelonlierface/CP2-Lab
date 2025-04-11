import java.util.Scanner;

public class GeneticCode_Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		String s = input.nextLine();
        int rm = 0;
        while(s.indexOf("<") != -1 || s.indexOf(">") != -1) {
            System.out.println((s.indexOf("<") + rm) + " " + (s.indexOf(">") + rm));
            if (s.indexOf("<") == 0) s = s.substring(s.indexOf("<") + 1, s.indexOf(">")) + s.substring(s.indexOf(">") + 1);
            else if (s.indexOf(">") == s.length()) s = s.substring(0, s.indexOf("<")) + s.substring(s.indexOf("<") + 1, s.indexOf(">"));
            else s = s.substring(0, s.indexOf("<")) + s.substring(s.indexOf("<") + 1, s.indexOf(">")) + s.substring(s.indexOf(">") + 1);
            rm += 2;
        }
        input.close();
    }
}
