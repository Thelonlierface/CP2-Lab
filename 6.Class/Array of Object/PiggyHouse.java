import java.util.Scanner;

class House {
    int width;
    int length;
    int piggies;
    public String name;

    /* more variables */
    House(int w, int l) {
        this.width = w;
        this.length = l;
    }

    /* overloaded constructor */
    House(String name, int w, int l, int piggies) {
        this.name = name;
        this.width = w;
        this.length = l;
        this.piggies = piggies;
        System.out.printf("%s, Width %d, Length %d, Piggies %d\n", this.name, this.width, this.length, this.piggies);
    }

    void printPiggies() {
        System.out.printf("%s, Piggies %d, Used %d, Left %d\n", name, piggies, (9 * piggies),
                ((width * length) - (9 * piggies)));
    }

    static void encourage() {
        System.out.println("Piggy Together STRONG!");
    }

    /* more methods */
    boolean addPiggies(int k) {
        if (9 * (piggies + k) <= width * length) {
            piggies += k;
            return true;
        }
        return false;
    }

    int removePiggies(int r) {
        if (piggies - r >= 0) {
            piggies -= r;
            return r;
        } else {
            int res = piggies;
            piggies = 0;
            return res;
        }
    }
}

public class PiggyHouse {
    public static void main(String[] args) {
        House.encourage();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        House[] h = new House[N];
        for (int i = 0; i < N; i++) {
            int w = sc.nextInt();
            int l = sc.nextInt();
            int pigs = sc.nextInt();
            String name = sc.next();
            h[i] = new House(name, w, l, pigs);
        }
        while (true) {
            int C = sc.nextInt();
            if (C == 0) {
                break;
            }
            if (C == 1) {
                int m = sc.nextInt() - 1;
                h[m].printPiggies();
            }
            if (C == 2) {
                int m = sc.nextInt() - 1;
                int k = sc.nextInt();
                boolean add = h[m].addPiggies(k);
                if (add)
                    h[m].printPiggies();
                else
                    System.out.println("Sorry");
            }
            if (C == 3) {
                int m = sc.nextInt() - 1;
                int r = sc.nextInt();
                int rm = h[m].removePiggies(r);
                System.out.printf("remove %d from %s\n", rm, h[m].name);
            }
            if (C == 4) {
                int m = sc.nextInt() - 1;
                int j = sc.nextInt() - 1;
                int k = sc.nextInt();
                int temp = h[m].removePiggies(k);
                boolean move = h[j].addPiggies(temp);
                System.out.println(move ? String.format("move %d piggies from %s to %s", temp, h[m].name, h[j].name)
                        : "Unsuccessful");
            }
        }
        sc.close();
    }
}
