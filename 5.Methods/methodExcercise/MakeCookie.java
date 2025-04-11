import java.util.Scanner;

public class MakeCookie {
    static void calCookieBags(int flour, int butter) {
        int bags = Math.min(flour/6, butter/3);
        boolean validFlour = flour >= 0 && flour < 100000;
        boolean validButter = butter >= 0 && butter < 100000;
        flour -= validFlour && validButter ? 6*bags : 0;
        butter -= validFlour && validButter ? 3*bags : 0;
        validFlour = flour >= 0 && flour < 100000;
        validButter = butter >= 0 && butter < 100000;
        System.out.println("Cookie bags: " + ((validFlour && validButter) ? bags : "Error"));
        System.out.println("Flour left: " + (validFlour ? flour : "Invalid"));
        System.out.println("Butter left: " + (validButter ? butter : "Invalid"));
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int flour = scan.nextInt();
        int butter = scan.nextInt();
        calCookieBags(flour, butter);
        scan.close();
    }
}