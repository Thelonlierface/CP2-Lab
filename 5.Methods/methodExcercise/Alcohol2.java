import java.util.Scanner;

public class Alcohol2 {
    static void dilute(int perc, int ml, int type, int targetPerc, int targetMl) {
        if(perc <= targetPerc) {
            System.out.println(targetPerc + " more than " + perc);
        }
        else {
            int finalAlc = targetPerc * targetMl / perc;
            System.out.println(finalAlc + " " + (targetMl - finalAlc));
            if(finalAlc <= ml) {
                System.out.println("OK");
            }
            else {
                System.out.println("NO");
            }
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int perc = input.nextInt();
        int ml = input.nextInt();
        int type = input.nextInt();
        int targetPerc = input.nextInt();
        int targetMl = input.nextInt();
        dilute(perc, ml, type, targetPerc, targetMl);
        input.close();
    }
}
