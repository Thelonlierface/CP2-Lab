import java.util.Scanner;

public class CharsCompete1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		String s = input.nextLine();
        String comp1 = input.next();
        String comp2 = input.next();
        int targetScore = input.nextInt();
        char c1 = comp1.charAt(0);
        char c2 = comp2.charAt(0);
        int c1Count = 0;
        int c2Count = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == c1) {
                c1Count++;
                if(c1Count == targetScore) {
                    System.out.println(c1);
                    System.out.println(c1Count + " " + c2Count);
                    System.exit(1);
                }
            }
            else if(s.charAt(i) == c2) {
                c2Count++;
                if(c2Count == targetScore) {
                    System.out.println(c2);
                    System.out.println(c2Count + " " + c1Count);
                    System.exit(2);
                }
            }
        }
        System.out.println("draw");
        System.out.println(c1Count + " " + c2Count);
		input.close();
    }

}
