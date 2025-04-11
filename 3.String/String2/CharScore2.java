import java.util.Scanner;

public class CharScore2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		String s = input.nextLine();
        int div = s.length()/2;
        int dis = Integer.MAX_VALUE;
        boolean dir = true; //true for forward, false for backwards
        int finalL = 0;
        int finalR = 0;
        while (true) {
            int l = 0;
            int r = 0;
            for (int i = 0; i < div; i++) {
                l += s.charAt(i) - 64;
            }
            for (int i = div; i < s.length(); i++) {
                r += s.charAt(i) - 64;
            }
            int tempDis = Math.abs(l - r);
            if (l == r) {
                finalL = l;
                finalR = r;
                break;
            }
            else if(tempDis >= dis) {
                div += dir ? -1 : 1; 
                for (int i = 0; i < div; i++) {
                    finalL += s.charAt(i) - 64;
                }
                for (int i = div; i < s.length(); i++) {
                    finalR += s.charAt(i) - 64;
                }
                break;
            }
            else {
                div += l < r ? 1 : -1;
                dir = l < r;
                dis = tempDis;
            }
        }
        System.out.println(finalL + " " + finalR);
        System.out.println(s.substring(0, div) + " " + s.substring(div, s.length()));
		input.close();
    }
}
//editor's note : this is not the most efficient way to solve