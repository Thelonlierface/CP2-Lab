import java.util.Scanner;

public class CookiePlan {
    static void planCookie(int[] flour, int[] butter) {
        int count = 0;
        for (int i = 0; i < butter.length; i++) {
            int bags = Math.min(flour[i]/6, butter[i]/3);
            boolean validFlour = flour[i] >= 0 && flour[i] < 100000;
            boolean validButter = butter[i] >= 0 && butter[i] < 100000;
            flour[i] -= validFlour && validButter ? 6*bags : 0;
            butter[i] -= validFlour && validButter ? 3*bags : 0;
            validFlour = flour[i] >= 0 && flour[i] < 100000;
            validButter = butter[i] >= 0 && butter[i] < 100000;
            if((!(validFlour && validButter)) || bags < 10) {
                count++;
                System.out.println(i+1);
            }
        }
        System.out.println(String.format("There are %d days that ingredients are insufficient", count));
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int N = scan.nextInt();
        int[] flours = new int[N];
        int[] butters = new int[N];
        for (int i = 0; i < butters.length; i++) {
            flours[i] = scan.nextInt();
            butters[i] = scan.nextInt();
        }
        planCookie(flours, butters);
        scan.close();
    }
}
