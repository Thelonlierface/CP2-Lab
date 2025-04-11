import java.util.Scanner;

public class CharsCompete2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		String s = input.next();
        int chars = input.nextInt();
        char[] team1 = new char[chars];
        char[] team2 = new char[chars];
        int t1c = 0;
        int t2c = 0;
        for (int i = 0; i < chars; i++) {
            team1[i] = input.next().charAt(0);
        }
        for (int i = 0; i < chars; i++) {
            team2[i] = input.next().charAt(0);
        }
        int targetScore = input.nextInt();
        for (int i = 0; i < s.length(); i++) {
            boolean found = false;
            for (int j = 0; j < team1.length; j++) {
                if (s.charAt(i) == team1[j]) {
                    t1c++;
                    found = true;
                    if (t1c == targetScore) {
                        System.out.println(1);
                        System.out.println(t1c + " " + t2c);
                        System.exit(1);
                    }
                    else if(found) {
                        break;
                    }
                }
            }
            if(found) continue;
            for (int j = 0; j < team2.length; j++) {
                if (s.charAt(i) == team2[j]) {
                    t2c++;
                    found = true;
                    if (t2c == targetScore) {
                        System.out.println(2);
                        System.out.println(t2c + " " + t1c);
                        System.exit(2);
                    }
                    else if (found) {
                        break;
                    }
                }
            }
        }
        if(t1c == t2c) {
            System.out.println("draw");
            System.out.println(t1c + " " + t2c);
        }
        else if(t1c > t2c) {
            System.out.println(1);
            System.out.println(t1c + " " + t2c);
            System.exit(1);
        }
        else {
            System.out.println(2);
            System.out.println(t2c + " " + t1c);
            System.exit(2);
        }
		input.close();
    }
}
