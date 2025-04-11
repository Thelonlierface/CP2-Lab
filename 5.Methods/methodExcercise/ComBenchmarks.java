import java.util.Scanner;
class ComAndBench {
    int cpuPow;
    int gpuPow;
    int ramAmt;
    int cpuPrc;
    int gpuPrc;
    int ramPrc;
    int totalPrice;

    int WindStrike;
    int PastMark;
    int Soreal;
    int SiSandro;

    public ComAndBench(int cpuPows, int gpuPows, int ramAmts, int cpuPrcs, int gpuPrcs, int ramPrcs) {
        this.cpuPow = cpuPows;
        this.gpuPow = gpuPows;
        this.ramAmt = ramAmts;
        this.cpuPrc = cpuPrcs;
        this.gpuPrc = gpuPrcs;
        this.ramPrc = ramPrcs;
        this.totalPrice = cpuPrcs + gpuPrcs + ramPrcs;
    }

    public void runWindStrike() {
        int pow = this.cpuPow + this.gpuPow;
        if(this.ramAmt <= 4) {
            this.WindStrike = pow / 2;
        }
        else if(this.ramAmt > 8) {
            this.WindStrike = pow * 2;
        }
        else {
            this.WindStrike = pow;
        }
    }

    public void runPastMark() {
        this.PastMark = Math.max(this.cpuPow, this.gpuPow);
    }

    public void runSoreal() {
        int pow = this.gpuPow + (this.cpuPow/2);
        if(this.PastMark >= 300) {
            this.Soreal = pow;
        }
        else {
            this.Soreal = pow/2;
        }
    }

    public boolean runSiSandro() {
        if(this.ramAmt < 4) {
            System.out.println("SiSandro Failed");
            return false;
        }
        else {
            this.SiSandro = this.ramAmt*100 + this.cpuPow;
            return true;
        }
    }

    public void runAllBenches() {
        runPastMark();
        runWindStrike();
        runSoreal();
        System.out.println(String.format("WindStrike: %d\nPastMark: %d\nSoreal: %d\nSiSandro: ", this.WindStrike, this.PastMark, this.Soreal ) + (runSiSandro() ? this.SiSandro : "Failed"));
    }

    public void reportPerfPerPrice() {
        int ppp = (this.PastMark + this.Soreal + this.WindStrike) / (this.cpuPrc + this.gpuPrc + this.ramPrc);
        System.out.println("Performance per Price = " + ppp);
    }
}
public class ComBenchmarks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cpuPow = scan.nextInt();
        int gpuPow = scan.nextInt();
        int ramAmt = scan.nextInt();
        int cpuPrc = scan.nextInt();
        int gpuPrc = scan.nextInt();
        int ramPrc = scan.nextInt();
        ComAndBench comB = new ComAndBench(cpuPow, gpuPow, ramAmt, cpuPrc, gpuPrc, ramPrc);
        comB.runAllBenches();
        comB.reportPerfPerPrice();
        scan.close();
    }
}