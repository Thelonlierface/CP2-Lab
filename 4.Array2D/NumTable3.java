import java.util.ArrayList;
import java.util.Scanner;

public class NumTable3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r = input.nextInt();
        int c = input.nextInt();
        int[][] arr = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = input.nextInt();
            }
        }
        int k = input.nextInt();
        int maxLen = -1;
        int tempLen = 0;
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            int x = input.nextInt() - 1;
            int y = input.nextInt() - 1;
            if (x >= 0 && x < r && y >= 0 && y < c) {
                tempLen++;
            }
            else {
                res.add(tempLen);
                maxLen = tempLen > maxLen ? tempLen : maxLen;
                tempLen = 0;
            }
        } 
        res.add(tempLen);
        maxLen = tempLen > maxLen ? tempLen : maxLen;
        int maxLenCount = 0;
        for (int i = 0; i < res.size(); i++) {
            maxLenCount += res.get(i) == maxLen ? 1 : 0;
        }

        System.out.println(maxLen);
        System.out.println(maxLenCount);
    }
}
