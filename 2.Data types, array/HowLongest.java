
import java.util.ArrayList;
import java.util.Scanner;

public class HowLongest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] seq = new int[n];
        int currConsec = 0;
        int maxConsec = 0;
        for (int i = 0; i < seq.length; i++) {
            seq[i] = input.nextInt();
            if(seq[i] == 1) {
                currConsec++;
                if(currConsec > maxConsec) {
                    maxConsec = currConsec;
                }
            }
            else {
                currConsec = 0;
            }
        }
        ArrayList<Integer> startingIndex = new ArrayList<>();
        currConsec = 0;
        int index = 0;
        if(seq[0] == 1) {
            currConsec++;
        }
        for (int i = 1; i < seq.length; i++) {
            if(seq[i] == 1) {
                if(seq[i-1] == 0) {
                    index = i;
                }
                currConsec++;
            }
            else {
                if(currConsec == maxConsec) {
                    startingIndex.add(index);
                }
                currConsec = 0;
            }
        }
        if(seq[n-1] == 1 && currConsec == maxConsec) {
            startingIndex.add(index);
        }
        System.out.println(maxConsec);
        for (int ind : startingIndex) {
           System.out.print((ind+1) + " "); 
        }
    }
}
//all these was pretty unnecessary because in the actual testcase, there is only one longest consec chain