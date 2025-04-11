import java.util.Scanner;

public class LongestConsec_but_Im_too_lazy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] seq = new int[n];
        int currConsec = 0;
        int maxConsec = 0;
        int index = 0;
        int maxIndex = 0;
        seq[0] = input.nextInt();
        if(seq[0] == 1) {
            currConsec++;
            maxConsec = currConsec;
        }
        for (int i = 1; i < seq.length; i++) {
            seq[i] = input.nextInt();
            if(seq[i] == 1) {
                if(seq[i-1] == 0) {
                    index = i;
                }
                currConsec++;
                if(currConsec > maxConsec) {
                    maxConsec = currConsec;
                    maxIndex = index;
                }
            }
            else {
                currConsec = 0;
            }
        }
        input.close();
        System.out.println(maxConsec);
        System.out.println(maxIndex + 1);
    }
}
