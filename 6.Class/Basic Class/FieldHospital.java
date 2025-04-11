import java.util.Arrays;
import java.util.Scanner;

class FieldManager {
    int bedCount;
    boolean[] bedIsAvailible;

    public FieldManager(int bedC) {
        bedCount = bedC;
        bedIsAvailible = new boolean[bedC];
        Arrays.fill(bedIsAvailible, true);
    }

    int reserveBed() {
        for (int i = 0; i < bedIsAvailible.length; i++) {
            if(bedIsAvailible[i]) {
                bedIsAvailible[i] = false;
                return i+1;
            }
        }
        return -1;
    }

    boolean discharge(int bedNum) {
        if(bedIsAvailible[bedNum-1]) {
            System.out.println("Invalid bed number");
            return false;
        }
        else {
            System.out.println("Patient discharged");
            bedIsAvailible[bedNum-1] = true;
            return true;
        }
    }

    void reportBed() {
        int count = 0;
        for (int i = 0; i < bedIsAvailible.length; i++) {
            if(!bedIsAvailible[i]) count++;
        }
        System.out.println(count);
    }
}

public class FieldHospital {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int N = scan.nextInt();
        FieldManager fm = new FieldManager(N);

        final int Q = scan.nextInt();
        for(int i = 0; i < Q; ++i) {
            int K = scan.nextInt();
            int A = scan.nextInt();
            switch (K) {
                case 1:
                    int bedAquriance = fm.reserveBed();
                    System.out.println(bedAquriance != -1 ? String.format("Bed %d reserved", bedAquriance) : "No bed vacancy");
                    break;
                case 2:
                    fm.discharge(A);
                    break;
                case 3:
                    fm.reportBed();
                    break;
            }
        }
        scan.close();
    }
}