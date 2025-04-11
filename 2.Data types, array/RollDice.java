
import java.util.Scanner;

public class RollDice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] board = new int[n];
        int[] points = new int[n];
        for (int i = 0; i < points.length; i++) {
            points[i] = input.nextInt();
        }
        for (int i = 0; i < board.length; i++) {
            board[i] = input.nextInt();
        }
        int index = 0;
        int totalPoints = 0;
        int m = input.nextInt();
        for (int i = 0; i < m; i++) {
            int roll = input.nextInt();
            index += roll;

            index = index < 0 ? n + index : index;
            index = index > n - 1 ? index - n : index;

            totalPoints += points[index];
            int prev = index;
            index += board[index];
            
            index = index < 0 ? n + index : index;
            index = index > n - 1 ? index - n : index;
            
            totalPoints += index == prev ? 0 : points[index];
            System.out.println(index + " " + totalPoints);
        }
        input.close();
    }
    
}
