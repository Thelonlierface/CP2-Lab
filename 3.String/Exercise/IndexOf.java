import java.util.Scanner;

public class IndexOf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        String target = input.next();
        if (s.indexOf(target) != -1) System.out.println(s.indexOf(target) + 1);
        else System.out.println("string not found");
        input.close();
    }
}

