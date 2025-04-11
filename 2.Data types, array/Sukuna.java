import java.util.Scanner;

public class Sukuna {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] box = new int[n];
        int[] used = new int[n+1];
        int count = 0;
        for (int i = 0; i < box.length; i++) {
            box[i] = input.nextInt();
        }
        while (true) { 
            int item = input.nextInt();
            if(item <= 0) {
                input.close();
                break;
            }
            int box_num = input.nextInt() - 1;
            if (item > 999 || item < 100 || count >= 20) {
                System.out.println("JUBUTSU !");
                used[n]++;
                continue;
            }
            if(box_num >= n || box_num < 0) {
                System.out.println("SUKUNA !");
                if(item > 99 && item < 1000) {
                    count++;
                }
                continue;
            }
            if(used[box_num] < box[box_num]) {
                System.out.println("OK !");
                used[box_num]++;
                count++;
            }
            else {
                System.out.println("SUKUNA !");
                count++;
            }
        }
        for (int i = 0; i < used.length - 1; i++) {
            System.out.println((i + 1) + " " + used[i]);
        }
        System.out.println(used[n]);
    }
}
