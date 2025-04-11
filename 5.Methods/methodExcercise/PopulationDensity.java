import java.util.Scanner;

public class PopulationDensity {
    public long density(double population, double area) {
        return Math.round(population / area);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PopulationDensity pd = new PopulationDensity();
        int npeople = sc.nextInt();
        double area = sc.nextDouble();
        long d = pd.density(npeople, area);
        System.out.println("population density is " + d);
        sc.close();
    }
}
