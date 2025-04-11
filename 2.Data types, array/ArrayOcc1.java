import java.util.Scanner;

public class ArrayOcc1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        int[] reserve = new int[k];
        for (int i = 0; i < reserve.length; i++) {
            reserve[i] = input.nextInt() - 1;
        }
        int success = 0;
        int outOfBound = 0;
        int occupied = 0;
        int[] checker = new int[n];
        int max = 0;
        
        for (int i = 0; i < reserve.length; i++) {
            if(reserve[i] >= 0 && reserve[i] < n) {
                if(checker[reserve[i]] == 0) {
                    success++;
                }
                else {
                    occupied++;
                }
                checker[reserve[i]]++;
                max = Math.max(max, checker[reserve[i]]);
            }
            else {
                outOfBound++;
            }
        }
        
         
        System.out.println(success);
        System.out.println(outOfBound);
        System.out.println(occupied);
        for (int i = 0; i < checker.length; i++) {
            if(checker[i] == max) {
                System.out.print((i + 1) + " ");
            }
        }
    }
}
