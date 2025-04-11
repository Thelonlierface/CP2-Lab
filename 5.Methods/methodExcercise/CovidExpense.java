import java.util.Scanner;

public class CovidExpense {
    static int[] calCovidExpense(int[] rtpcr, int[] med, int[] inpat, int[] breath) {
        int[] cost = new int[4];
        for (int i = 0; i < breath.length; i++) {
            if(rtpcr[i] == 1) {
                cost[0] += 1500;
            }
            cost[1] += 80;
            if(med[i] == 1) {
                cost[1] += 50;
            }
            if(inpat[i] == 1) {
                cost[2] += 800;
            }
            if(breath[i] == 1) {
                cost[3] += 2000;
            }
        }
        return cost;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int N = scan.nextInt();
        int[] rtpcr = new int[N];
        int[] med = new int[N];
        int[] inpat = new int[N];
        int[] breath = new int[N];
        for (int i = 0; i < N; i++) {
            rtpcr[i] = scan.nextInt();
            med[i] = scan.nextInt();
            inpat[i] = scan.nextInt();
            breath[i] = scan.nextInt();
        }
        String[] txt = {"RT-PCR cost = ", "Medicine cost = ", "Inpatient cost = ", "Breath-aid equipment cost = "};
        int[] cost = calCovidExpense(rtpcr, med, inpat, breath);
        for (int i = 0; i < cost.length; i++) {
            System.out.println(txt[i] + cost[i]);
        }
        scan.close();
    }
}