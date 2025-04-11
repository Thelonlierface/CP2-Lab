import java.util.Scanner;

public class IndexOf2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
	    String s = input.nextLine();
        String target = input.nextLine();
        boolean found = false;
        for (int i = 0; i < s.length(); i++) {
            if(s.indexOf(target, i) == i) {
                System.out.print((i+1) + " ");
                found = true;
            }
        }
        if(!found) System.out.println("string not found");
        input.close();
    }
}
