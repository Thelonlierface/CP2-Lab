import java.util.Scanner;

public class ArrayOcc2 {
    public int longestConsec(int[] checker) {
        int maxConsec = 0;
        int currConsec = 0;
        for (int i = 0; i < checker.length; i++) {
            if(checker[i] == 0) {
                currConsec++;
                if(currConsec > maxConsec) {
                    maxConsec = currConsec;
                }
            }
            else {
                currConsec = 0;
            }
        }
        return maxConsec;
    }
    public void lastChainIndex(int[] checker, int lc) {
        int currConsec = 0;
        for (int i = 0; i < checker.length - 1; i++) {
            if(checker[i] == 0) {
                currConsec++;
            }
            else if(checker[i] != 0 && currConsec == lc) {
                System.out.print((i) + " ");
                currConsec = 0;
            }
            else {
                currConsec = 0;
            }
        }
        if(checker[checker.length - 1] == 0 && currConsec == lc - 1) {
            System.out.print(checker.length);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayOcc2 ao2 = new ArrayOcc2();
        int n = input.nextInt();
        int k = input.nextInt();
        int[] reserve = new int[k];
        for (int i = 0; i < reserve.length; i++) {
            reserve[i] = input.nextInt();
            reserve[i]--;
        }
        int[] checker = new int[n];
        for (int check : checker) {
            check = 0;
        }
        for (int i = 0; i < reserve.length; i++) {
            if (reserve[i] >= 0 && reserve[i] < n) {
                checker[reserve[i]]++;
            }
        }
        int maxLen = ao2.longestConsec(checker);
        System.out.println(maxLen);
        ao2.lastChainIndex(checker, maxLen);
        // for (int i = 0; i < checker.length; i++) {
        //     System.out.print(checker[i] + " ");
        // }
    }
}
