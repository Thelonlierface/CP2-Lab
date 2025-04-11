import java.util.Scanner;

public class CountBetween1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		int n = input.nextInt();
        int[] in = new int[n];
        for (int i = 0; i < n; i++) {
            in[i] = input.nextInt();
        }
        int x1 = input.nextInt();
        int x2 = input.nextInt();
        int y1 = input.nextInt();
        int y2 = input.nextInt();
        int lx = x1 < x2 ? x1 : x2;
        int rx  = x1 > x2 ? x1 : x2;
        int ly = y1 < y2 ? y1 : y2;
        int ry  = y1 > y2 ? y1 : y2;
        int xcount = 0;
        int ycount = 0;
        int oub = 0;
        for (int i = 0; i < in.length; i++) {
            if(in[i] >= lx && in[i] <= rx) xcount++;
            else if(in[i] >= ly && in[i] <= ry) ycount++;
            else oub++;
        }
        System.out.println(xcount);
        System.out.println(ycount);
        System.out.println(oub);
        input.close();
    }
}
