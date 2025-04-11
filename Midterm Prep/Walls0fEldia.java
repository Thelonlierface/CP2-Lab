import java.util.Scanner;

public class Walls0fEldia {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int rol = sc.nextInt();
        int size_wall = 6 + rol;
        int Survey = 0, t1 = 0, t4 = 0, t6 = 0, t8 = 0, t9 = 0;
        int wall[][] = new int[size_wall][size_wall];
        for (;;) {
            int r = sc.nextInt();
            int c = sc.nextInt();
            int titan = sc.nextInt();
            if (r < 0 || r >= size_wall || c < 0 || c >= size_wall || titan < 0 || titan > 9) {
                break;
            }
            wall[r][c] = titan;
        }
        System.out.println("WALL MAP [" + (size_wall * size_wall) + "]");

        // your codes loops
        for (int i = 0; i < wall.length; i++) {
            for (int j = 0; j < wall.length; j++) {
                System.out.print(wall[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("WALL MAP [" + (size_wall * size_wall) + "]");

        // your codes loops counting and condition (if,else or else if)
        for (int i = 0; i < wall.length; i++) {
            for (int j = 0; j < wall.length; j++) {
                if (wall[i][j] != 0 && ((i < 3 || i >= size_wall - 3) || (j < 3 || j >= size_wall - 3))) {
                    if (wall[i][j] != 1 && wall[i][j] != 4 && wall[i][j] != 6 && wall[i][j] != 8 && wall[i][j] != 9) {
                        Survey++;
                        continue;
                    }
                    if ((i == 0 || i == size_wall - 1) || (j == 0 || j == size_wall - 1)) {
                        System.out.print("Wall Maria");
                    } else if ((i == 1 || i == size_wall - 2) || (j == 1 || j == size_wall - 2)) {
                        System.out.print("Wall Rose");
                    } else {
                        System.out.print("Wall Sina");
                    }
                    System.out.print(" " + i + " " + j + " ");
                    switch (wall[i][j]) {
                        case 1:
                            t1++;
                            System.out.print("Deviant");
                            break;
                        case 4:
                            t4++;
                            System.out.print("Attack Titan");
                            break;
                        case 6:
                            t6++;
                            System.out.print("War Hammer Titan");
                            break;
                        case 8:
                            t8++;
                            System.out.print("Armored Titan");
                            break;
                        case 9:
                            t9++;
                            System.out.print("Colossus Titan");
                            break;
                    }
                    System.out.println();
                }
            }
        }

        System.out.println("Survey Corps " + Survey);
        System.out.println("Deviant " + t1);
        System.out.println("Attack Titan " + t4);
        System.out.println("War Hammer Titan " + t6);
        System.out.println("Armored Titan " + t8);
        System.out.println("Colossus Titan " + t9);
        sc.close();
    }

}
