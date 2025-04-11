import java.util.Scanner;

public class BookTheater {
    static int[][] seat;
    static int findAvailibleSeat(int row, int person) {
        for (int i = 0; i < seat.length; i++) {
            if(seat[row][i] == 0 && i + person < seat.length) {
                return i;
            }
        }
        return -1;
    }
    static void reserveSeat(int row, int person) {
        int fas = findAvailibleSeat(row, person);
        for (int i = fas; i < fas + person; i++) {
            seat[row][i] = 1;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        seat = new int[n][n];
        for (;;) {
            int row = input.nextInt();
            int person = input.nextInt();
            if(row == -1 || person == -1) {
                input.close();
                break;
            }
            if(findAvailibleSeat(row, person) == -1) {
                System.out.println("full");
            }
            else {
                System.out.println("reserve");
                reserveSeat(row, person);
            }
        }
    }
}
