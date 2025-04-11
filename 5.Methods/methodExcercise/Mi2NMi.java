import java.util.Scanner;

public class Mi2NMi {
    static double mi2nmi(double mi) {
        return mi * 0.868976;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double mi = sc.nextDouble();
        System.out.println(mi2nmi(mi) + " nmi");
        sc.close();
    }
}