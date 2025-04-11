import java.util.Scanner;

public class High_Evolutionary {
    static int ev(int w, int x, int y, int z) {
        System.out.print(((w + x) - y * z) + " ");
        System.out.print((w + x - (y * z)) + " ");
        System.out.print((w + (x - y) * z) + " ");
        System.out.println(((w + x) - y) * z);
        return Math.max((w + x) - y * z, Math.max(w + x - (y * z), Math.max(w + (x - y) * z, ((w + x) - y) * z)));
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int w = input.nextInt();
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();
        System.out.println(ev(w, x, y, z));
        input.close();
    }
}
