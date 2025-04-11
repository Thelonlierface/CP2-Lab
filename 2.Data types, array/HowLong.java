import java.util.Scanner;

public class HowLong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] seq = new int[n];
        for (int i = 0; i < seq.length; i++) {
            seq[i] = input.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            int pos = input.nextInt();
            pos--;
            int count = 0;
            for (int j = pos; j < seq.length; j++) {
                if(seq[j] == 1) {
                    count++;
                }
                else {
                    System.out.println(count);
                    break;
                }
            }
        }
        input.close();
    }
}
/*
 * fsr, on the sample case of :
 * 14
 * 0 1 1 1 0 1 1 0 1 1 1 1 1 1
 * 2 9 1
 * the input of number 9 won't return anything
 */