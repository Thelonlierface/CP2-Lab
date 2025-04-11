import java.util.Scanner;

public class CharInRange1 {
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
        for (int i = 0; i < range.length; i++) {
            String s = input.next();
            int c = s.charAt(0);
            boolean printed = false;
            for (int j = 0; j < range.length; j++) {
                if(c >= range[j][0] && c <= range[j][1]) {
                    System.out.print((j+1) + " ");
                    printed = true;
                }
            }
            if(!printed) System.out.print(0);
            System.out.println();
        }
        input.close();
    }
}
