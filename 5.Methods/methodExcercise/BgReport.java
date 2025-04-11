import java.util.Scanner;

public class BgReport {
    void report(String name, int birthYear, int startYear) {
        System.out.print("Name: ");
        if(name.length() < 2) System.out.println("INVALID");
        else System.out.println(name);
        int age = startYear - birthYear;
        boolean birthYearIsValid = birthYear >= 1900 && birthYear <= 2022;
        boolean startYearIsValid = birthYearIsValid && age >= 18 && startYear >= 1900 && startYear <= 2022;
        System.out.println("Birth year: " + (birthYearIsValid ? birthYear : "INVALID"));
        System.out.println("Start year: " + (startYearIsValid ? startYear : "INVALID"));
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        int birthYear = scan.nextInt();
        int startYear = scan.nextInt();
        BgReport bp = new BgReport();
        bp.report(name, birthYear, startYear);
        scan.close();
    }
}