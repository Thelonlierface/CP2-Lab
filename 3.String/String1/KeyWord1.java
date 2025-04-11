import java.util.ArrayList;
import java.util.Scanner;

public class KeyWord1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        ArrayList<String> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String s = input.next();
            boolean isDup = false;
            for (int j = 0; j < res.size(); j++) {
                if(s.equalsIgnoreCase(res.get(j))) {
                    isDup = true;
                    break;
                }
            }
            if(!isDup) {
                res.add(s);
            }
        }
        input.close();
		for (String s : res) {
            System.out.print(s + " ");
        }
    }
}
