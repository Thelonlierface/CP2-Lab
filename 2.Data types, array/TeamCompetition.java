import java.util.Scanner;

public class TeamCompetition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] team1 = new int[n];
        int[] team2 = new int[n];
        for (int i = 0; i < team2.length; i++) {
            team1[i] = input.nextInt();
        }
        for (int i = 0; i < team2.length; i++) {
            team2[i] = input.nextInt();
        }
        int t1Score = 0;
        int t2Score = 0;
        for (int i = 0; i < team2.length; i++) {
            if(team1[i] > team2[i]) {
                t1Score += 2;
            }
            else if(team1[i] == team2[i]) {
                t1Score++;
                t2Score++;
            }
            else {
                t2Score += 2;
            }
        }
        if(t1Score == t2Score) {
            System.out.println("Draw game");
            System.out.println("Score " + t1Score + " to " + t2Score);
        }
        else if(t1Score > t2Score) {
            System.out.println("Team 1 wins");
            System.out.println("Score " + t1Score + " to " + t2Score);
        }
        else {
            System.out.println("Team 2 wins");
            System.out.println("Score " + t2Score + " to " + t1Score);
        }
    }
}
