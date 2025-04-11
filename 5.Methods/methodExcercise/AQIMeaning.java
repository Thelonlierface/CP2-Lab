import java.util.Scanner;

public class AQIMeaning {
    public static void aqimeaning(int air) {
        if(air <= 50) System.out.println("Good");
        else if(air <= 100) System.out.println("Moderate");
        else if(air <= 150) System.out.println("Unhealthy for Sensitive Groups");
        else if(air <= 200) System.out.println("Unhealthy");
        else if(air <= 300) System.out.println("Very Unhealthy");
        else System.out.println("Hazardous");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int air = sc.nextInt();
        aqimeaning(air);
        sc.close();
    }
}
