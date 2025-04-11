import java.util.Arrays;
import java.util.Scanner;

public class Winner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r = input.nextInt();
        int c = input.nextInt();
        int[][] map = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                map[i][j] = input.nextInt();
            }
        }
        int k = input.nextInt();
        int[] res = new int[5]; //hit, miss, repHit, repMiss, oob
        int firstHit = -1;
        int lastHit = 0;

        for (int i = 0; i < k; i++) {
            int x = input.nextInt() - 1;
            int y = input.nextInt() - 1;
            if (x >= 0 && x < r && y >= 0 && y < c) {
                int target = map[x][y];
                switch (target) {
                    case -2:
                        res[3]++;
                        break;
                    case 0:
                        map[x][y] -= 2;
                        res[1]++;
                        break;
                    case 1:
                        map[x][y]++;
                        res[0]++;
                        lastHit = i + 1;
                        if(firstHit == -1) {
                            firstHit = i + 1;
                        }
                        break;
                    case 2:
                        res[2]++;
                        break;
                }
            } else {
                res[4]++;
            }
        }
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
        String finalMap = "";
        for (int i = 0; i < r; i++) {
            finalMap = finalMap.concat(Arrays.toString(map[i]).replaceAll("\\[|\\]|,|", ""));
        }
        if(finalMap.contains("1")) {
            System.out.print("battleship " + firstHit);
        }
        else {
            System.out.println("attacker " + lastHit);
        }
    }
}
