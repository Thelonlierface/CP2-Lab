import java.util.Scanner;

public class SimplePoker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int orderNum = 1;
        for (int i = 0; i < n; i++) {
            int[] freq = new int[10];
            int[] order = new int[10];
            for (int j = 0; j < 5; j++) {
                int card = input.nextInt();
                freq[card-1]++;
                order[card-1] += orderNum;
                orderNum++;
            }
            boolean hasCombination = false;
            for (int j = 0; j < freq.length; j++) {
                if(freq[j] == 2) {
                    boolean isTwoPair = false;
                    int j2;
                    for (j2 = j+1; j2 < freq.length; j2++) {
                        if(freq[j2] == 2) {
                            isTwoPair = true;
                            break;
                        }
                    }
                    if(isTwoPair) {
                        int c1 = order[j] < order[j2] ? j + 1 : j2 + 1;
                        int c2 = order[j] > order[j2] ? j + 1 : j2 + 1;
                        System.out.println("a two pair of " + c1 + " and " + c2);
                        hasCombination = true;
                        break;
                    }
                    else {
                        System.out.println("a pair of " + (j+1));
                        hasCombination = true;
                    }
                }
                else if(freq[j] == 3) {
                    System.out.println("tripple of " + (j+1));
                    hasCombination = true;
                }
                else if(freq[j] == 4) {
                    System.out.println("four of a kind of " + (j+1));
                    hasCombination = true;
                }
            }
            if(!hasCombination){
                System.out.println("no combination");
            }
        }
        input.close();
    }
}