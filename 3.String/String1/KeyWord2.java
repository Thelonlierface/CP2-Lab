import java.util.ArrayList;
import java.util.Scanner;

public class KeyWord2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        ArrayList<String> keyword = new ArrayList<>();
        ArrayList<Integer> freq = new ArrayList<>();
        int maxFreq = 0;
        for (int i = 0; i < n; i++) {
            String s = input.next();
            boolean isDup = false;
            int index = 0;
            for (int j = 0; j < keyword.size(); j++) {
                if(s.equalsIgnoreCase(keyword.get(j))) {
                    isDup = true;
                    index = j;
                    break;
                }
            }
            if(!isDup) {
                keyword.add(s);
                freq.add(1);
            }
            else {
                freq.set(index, freq.get(index) + 1);
                if(freq.get(index) > maxFreq) {
                    maxFreq = freq.get(index);
                }
            }
        }
        input.close();
		for (String s : keyword) {
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.print(maxFreq + " ");
        for (int i = 0; i < freq.size(); i++) {
            if(freq.get(i) == maxFreq) {
                System.out.print(keyword.get(i) + " ");
            }
        }
    }
}
