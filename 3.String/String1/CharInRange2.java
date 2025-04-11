import java.util.Scanner;

public class CharInRange2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] range = new int[3][2];
		for (int i = 0; i < range.length; i++) {
            for (int j = 0; j < range[i].length; j++) {
                String s = input.next();
                range[i][j] = s.charAt(0);
            }
            if(range[i][0] > range[i][1]) {
                int temp = range[i][0];
                range[i][0] = range[i][1];
                range[i][1] = temp;
            }
        }
        String target = input.next();
        int score = 0;
        int inRange = 0;
        int outOfRange = 0;
        for (int i = 0; i < target.length(); i++) {
            int c = target.charAt(i);
            boolean scores = false;
            for (int j = 0; j < range.length; j++) {
                if(c >= range[j][0] && c <= range[j][1]) {
                    score++;
                    scores = true;
                }
            }
            if(!scores) {
                outOfRange++;
                score -= 2;
            }
            else {
                inRange++;
            }
        }
        input.close();
        System.out.println(inRange);
        System.out.println(outOfRange);
        System.out.println(score);
    }
}
