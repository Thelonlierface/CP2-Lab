import java.util.Scanner;

public class Alcohol1 {
    static void printInfo(int perc, int ml, int type) {
        boolean pervIsValid = perc > 0;
        boolean mlIsValid = ml > 0;
        if(!pervIsValid) {
            perc = 0;
            System.out.println("invalid concentration");
        }
        if(!mlIsValid) {
            ml = 0;
            System.out.println("invalid volume");
        }
        System.out.println((type == 0 ? "Methyl Alcohol " : "Ethyl Alcohol ") + perc + "% " + ml + "ml.");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int perc = input.nextInt();
        int ml = input.nextInt();
        int type = input.nextInt();
        printInfo(perc, ml, type);
        input.close();
    }
}
