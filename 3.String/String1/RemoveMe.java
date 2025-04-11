import java.util.Scanner;

public class RemoveMe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		String s = input.nextLine();
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            int order = input.nextInt();
            String remove = input.next();
            int ind = 0;
            if(order == 1) ind = s.indexOf(remove);
            else ind = s.lastIndexOf(remove);
            if(ind == 0) {
                System.out.println(s.substring(remove.length()));
                s = s.substring(remove.length());
            }
            else if (ind != -1) {
                System.out.println(s.substring(0, ind) + s.substring(ind + remove.length()));
                s = s.substring(0, ind) + s.substring(ind + remove.length());
            }
            else {
                System.out.println(s);
            }
        }
        input.close();
    }
}
