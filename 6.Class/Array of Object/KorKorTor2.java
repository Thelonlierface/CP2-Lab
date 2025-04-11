import java.util.Scanner;

class Precinct {
    String unit;
    String[] partyName;
    int[] voteCount;

    Precinct(String unit, String[] partyName) {
        this.unit = unit;
        this.partyName = partyName;
        this.voteCount = new int[partyName.length];
    }

    void count(int vote) {
        vote -= 1;
        if (vote >= 0 && vote < voteCount.length) {
            this.voteCount[vote]++;
            System.out.println(partyName[vote] + " " + voteCount[vote]);
        } else {
            System.out.println("invalid number");
        }
    }

    void printInfo() {
        for (int i = 0; i < partyName.length; i++) {
            System.out.println((i+1) + " " + partyName[i] + " " + voteCount[i]);
        }
    }

    void printMax() {
        int max = voteCount[0];
        for (int i = 1; i < partyName.length; i++) {
            if (voteCount[i] > max) {
                max = voteCount[i];
            }
        }
        for (int i = 0; i < partyName.length; i++) {
            if(voteCount[i] == max) {
                System.out.println((i+1) + " " + partyName[i] + " " + max);
            }
        }
        
    }
}

public class KorKorTor2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String precName = input.next();
        int n = input.nextInt();
        String[] name = new String[n];
        for (int i = 0; i < name.length; i++) {
            name[i] = input.next();
        }
        Precinct prec = new Precinct(precName, name);
        int k = input.nextInt();
        for (int i = 0; i < k; i++) {
            int cmd = input.nextInt();
            switch (cmd) {
                case 1:
                    int vote = input.nextInt();
                    prec.count(vote);
                    break;
                case 2:
                    prec.printInfo();
                    break;
                case 3:
                    prec.printMax();
                    break;
            }
        }
        input.close();
    }
}
