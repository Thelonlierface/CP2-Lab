import java.util.Scanner;

public class ArrayOcc1Folk {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] arrays = new int[k]; //input array
        int[] repeat = new int[n];// no purpose
        for(int i = 0; i < k; i++)
        {
            arrays[i] = scan.nextInt();
        }
        for (int i = 0; i < repeat.length; i++) {
            repeat[i] = 0;
        }

        int success = 0, out_bound = 0, taken = 0;
        for(int i = 0; i < k ;i++) // find first 3 questions
        {
            if (arrays[i] < 1 || arrays[i] > n) {
                out_bound++;
                continue;
            }
            if (repeat[arrays[i]-1] == 0) {
                success++;
                repeat[arrays[i]-1]++;
            }
            else {
                repeat[arrays[i] - 1]++;
                taken++;
            }
        }

        System.out.printf("%d\n%d\n%d\n",success,out_bound,taken);
        int curRep = repeat[0];
        int maxRep = curRep;
        for (int j = 1; j < repeat.length; j++) {
            if(repeat[j] > curRep) {
                curRep = repeat[j];
                if(curRep > maxRep) {
                    maxRep = curRep;
                }
            }
        }
        for (int j = 0; j < repeat.length; j++) {
            if(repeat[j] == maxRep) {
                System.out.print((j+1) + " ");
            }
        }
    }
}
