import java.util.Scanner;

public class ArrayCompress1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] seq = new int[n+1];
        for (int i = 0; i < n; i++) {
            seq[i] = input.nextInt();
        } 
        int div = input.nextInt();
        seq[n] = div;
        int count = 0;
        int sum = 0;
        int[] res = new int[n];
        for (int i = 0; i < seq.length; i++) {
            if(seq[i] == div) {
                res[count] = sum;
                sum = 0;
                count++;
                res[count] = sum;
                count++;
            }
            sum += seq[i];
        }
        for (int i = 0; i < count-1; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
