import java.util.Scanner;

public class AgeReport {
    void reportAge(int[] ID, int[] age, int minAge, int maxAge) {
        int count = 0;
        for (int i = 0; i < age.length; i++) {
            if(age[i] >= minAge && age[i] <= maxAge) {
                System.out.println(ID[i]);
                count++;
            }
        }
        System.out.println(String.format("There are %d persons in age range of %d to %d", count, minAge, maxAge));
    }
       
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int N = scan.nextInt();
        int[] IDs = new int[N];
        int[] ages = new int[N];
        AgeReport a = new AgeReport();
        for (int i = 0; i < ages.length; i++) {
            IDs[i] = scan.nextInt();
            ages[i] = scan.nextInt();
        }
        int y1 = scan.nextInt();
        int y2 = scan.nextInt();
        a.reportAge(IDs, ages, y1, y2);
        scan.close();
    }
}


