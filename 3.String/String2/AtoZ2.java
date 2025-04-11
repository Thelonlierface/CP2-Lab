import java.util.ArrayList;
import java.util.Scanner;

public class AtoZ2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        ArrayList<Integer> aIndex = new ArrayList<>();
        ArrayList<Integer> zIndex = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') // s.indexOf('A', i)
                aIndex.add(i);
            if (s.charAt(i) == 'Z')
                zIndex.add(i);
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < aIndex.size(); i++) {
            for (int j = 0; j < zIndex.size(); j++) {
                if (Math.abs(aIndex.get(i) - zIndex.get(j)) < min)
                    min = Math.abs(aIndex.get(i) - zIndex.get(j));
                if (min == 1)
                    break;
            }
            if (min == 1)
                break;
        }
        System.out.println(min + 1);
        input.close();
    }
}
