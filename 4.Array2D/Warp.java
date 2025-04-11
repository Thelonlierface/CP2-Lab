import java.util.Scanner;

public class Warp {
    static int[] warpNum(int[][] map, int x, int y) {
        for (int i = x; i < map.length; i++) {
            for (int j = y; j < map[0].length; j++) {
                if(map[i][j] != 0) {
                    return new int[] {map[i][j], i, j};
                }
            }
        }
        return new int[] {-1, -1, -1};
    }
    static int[] findPortal(int[][] map, int[] portal) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                if(map[i][j] == portal[0] && (i != portal[1] || j != portal[2])){
                    return new int[] {portal[0], i, j};
                }
            }
        }
        return new int[] {-1, -1, -1};
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r = input.nextInt();
        int c = input.nextInt();
        int[][] map = new int[r][c];
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                map[i][j] = input.nextInt();
            }
        }
        int x = input.nextInt() - 1;
        int y = input.nextInt() - 1;
        int[] portalIn = warpNum(map, x, y);
        int[] portalOut = findPortal(map, portalIn);
        System.out.println(portalIn[0]);
        for (int i = 1; i < portalOut.length; i++) {
            System.out.print((portalIn[i]+1) + " ");
        }
        System.out.println();
        for (int i = 1; i < portalOut.length; i++) {
            System.out.print((portalOut[i]+1) + " ");
        }
        input.close();
    }
}
