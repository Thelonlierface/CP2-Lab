import java.util.Scanner;

public class SpellChecking2 {
    static boolean isInDict(String word, String[] dict) {
        for (int i = 0; i < dict.length; i++) {
            if(word.equals(dict[i])) return true;
        }
        return false;
    }

    static int[] matches(String word, String[] dict) {
        int[] matchCount = new int[dict.length];
        for (int i = 0; i < dict.length; i++) {
            for (int j = 0; j < Math.min(word.length(), dict[i].length()); j++) {
                if(word.charAt(j) == dict[i].charAt(j)) matchCount[i]++;
            }
        }
        return matchCount;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String[] dict = new String[n];
        for (int i = 0; i < dict.length; i++) {
            dict[i] = input.next();
        }

        int m = input.nextInt();
        for (int i = 0; i < m; i++) {
            String check = input.next();
            if(isInDict(check, dict)) {
                System.out.println(check);
                continue;
            }
            else {
                int[] mc = matches(check, dict);
                int max = 0;
                int mi = 0;
                for (int j = 0; j < mc.length; j++) {
                    if(mc[j] > max) {
                        max = mc[j];
                        mi = j;
                    }
                }
                System.out.println(dict[mi]);
            }
        }
        input.close();
    }
}
