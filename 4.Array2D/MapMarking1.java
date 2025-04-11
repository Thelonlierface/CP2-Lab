import java.util.Scanner;

public class MapMarking1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r = input.nextInt();
        int c = input.nextInt();
        int r1 = input.nextInt();
        int c1 = input.nextInt();
        int n = input.nextInt();
        int newLocation = 1;
        int[][] map = new int[r][c];
        map[r1 - 1][c1 - 1] = 1;
        for (int i = 0; i < n; i++) {
            int command = input.nextInt();
            switch (command) { //l, r, u, d
                case 1: c1--; break;
                case 2: c1++; break;
                case 3: r1--; break;
                case 4: r1++; break;
            }
            c1 = c1 > c ? c : c1;
            c1 = c1 < 1 ? 1 : c1;
            r1 = r1 > r ? r : r1;
            r1 = r1 < 1 ? 1 : r1;
            
            newLocation += map[r1 - 1][c1 - 1] == 0 ? 1 : 0;
            map[r1 - 1][c1 - 1]++;
        }
        input.close();
        System.out.println(r1 + " " + c1);
        System.out.println(newLocation);
    }
}
