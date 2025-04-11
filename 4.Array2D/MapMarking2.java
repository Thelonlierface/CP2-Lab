import java.util.Scanner;

public class MapMarking2 {
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
            int initialValue;

            switch (command) {
                case 1:
                    initialValue = c1;
                    do {
                        c1 = (c1 == 1) ? c : c1 - 1;
                        if (map[r1 - 1][c1 - 1] == 0) {
                            map[r1 - 1][c1 - 1] = 1;
                            newLocation++;
                            break;
                        }
                    } while (c1 != initialValue);
                    break;

                case 2:
                    initialValue = c1;
                    do {
                        c1 = (c1 == c) ? 1 : c1 + 1;
                        if (map[r1 - 1][c1 - 1] == 0) {
                            map[r1 - 1][c1 - 1] = 1;
                            newLocation++;
                            break;
                        }
                    } while (c1 != initialValue);
                    break;

                case 3:
                    initialValue = r1;
                    do {
                        r1 = (r1 == 1) ? r : r1 - 1;
                        if (map[r1 - 1][c1 - 1] == 0) {
                            map[r1 - 1][c1 - 1] = 1;
                            newLocation++;
                            break;
                        }
                    } while (r1 != initialValue);
                    break;

                case 4:
                    initialValue = r1;
                    do {
                        r1 = (r1 == r) ? 1 : r1 + 1;
                        if (map[r1 - 1][c1 - 1] == 0) {
                            map[r1 - 1][c1 - 1] = 1;
                            newLocation++;
                            break;
                        }
                    } while (r1 != initialValue);
                    break;
            }
        }

        input.close();
        System.out.println(r1 + " " + c1);
        System.out.println(newLocation);
    }
}
