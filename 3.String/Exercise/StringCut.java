import java.util.ArrayList;
import java.util.Scanner;

public class StringCut {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        String split = input.next();
        ArrayList<Integer> pos = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.indexOf(split, i) == i)
                pos.add(i);
        }
        if (pos.isEmpty())
            System.out.println("no target character found");
        else if (pos.size() == s.length())
            System.out.println("no output");
        else {
            if (!s.substring(0, pos.get(0)).isEmpty())
                System.out.println(s.substring(0, pos.get(0)));
            for (int i = 0; i < pos.size() - 1; i++) {
                if (!s.substring(pos.get(i) + 1, pos.get(i + 1)).isEmpty())
                    System.out.println(s.substring(pos.get(i) + 1, pos.get(i + 1)));
            }
            System.out.println(s.substring(pos.get(pos.size() - 1) + 1, s.length()));
        }
        input.close();
    }
}
