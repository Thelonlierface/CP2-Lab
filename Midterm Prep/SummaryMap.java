import java.util.Scanner;

public class SummaryMap {
    static boolean areaIsValid(int[][] map, int x, int y, int w, int l) {
        if(x+w > map.length || y+l > map[0].length) return false;
        for (int i = x; i < x+w && i < map.length; i++) {
            for (int j = y; j < y+l && j < map[0].length; j++) {
                if(map[i][j] == 1) return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r = input.nextInt();
        int c = input.nextInt();
        int[][] map = new int[r][c];
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            int x = input.nextInt() - 1;
            int y = input.nextInt() - 1;
            int width = input.nextInt();
            int length = input.nextInt();
            if(x < 0 || y < 0 || x >= r || y >= c) continue;
            // System.out.println(areaIsValid(map, x, y, width, length));
            // System.out.println(x + " " + y + " " + width + " " + length);
            if(width == 1 && length == 1) {
                map[x][y] = 1;
            }
            else if (areaIsValid(map, x, y, width, length)) {
                for (int k = x; k < x + width; k++) {
                    for (int j = y; j < y + length; j++) {
                        map[k][j] = 1;
                    }
                }
            }
            
        }
        for (int i2 = 0; i2 < map.length; i2++) {
            for (int j = 0; j < map[0].length; j++) {
                System.out.print(map[i2][j] + " ");
            }
            System.out.println();
        }
        input.close();
    }
}
