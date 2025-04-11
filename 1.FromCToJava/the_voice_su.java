
import java.util.Scanner;

public class the_voice_su {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int contestant = input.nextInt();
        int judge_cap = input.nextInt();
        int judge1 = 0;
        int judge2 = 0;
        for (int i = 0; i < contestant; i++) {
            int gender = input.nextInt(); 
            int score1 = input.nextInt(); 
            int score2 = input.nextInt();
            if(score1 > 8 && score2 > 8) {
                if(gender == 1) {
                    if(judge1 < judge_cap) {
                        System.out.println((i + 1) + " " + 1);
                        judge1++;
                    }
                    else if(judge2 < judge_cap){
                        System.out.println((i + 1) + " " + 2);
                        judge2++;
                    }
                }
                else {
                    if(judge2 < judge_cap) {
                        System.out.println((i + 1) + " " + 2);
                        judge2++;
                    }
                    else if(judge1 < judge_cap){
                        System.out.println((i + 1) + " " + 1);
                        judge1++;
                    }
                }
            }
            else if(score1 > 8 && judge1 < judge_cap) {
                System.out.println((i + 1) + " " + 1);
                judge1++;
            }
            else if(score2 > 8 && judge2 < judge_cap) {
                System.out.println((i + 1) + " " + 2);
                judge2++;
            }
        }
    }
}