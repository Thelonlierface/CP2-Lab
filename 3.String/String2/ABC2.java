import java.util.Scanner;

public class ABC2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		String s = input.nextLine();
        int count = 0;
        boolean firstOcc = true;
        int firstIndex = -1;
        for (int i = 0; i < s.length() - 2; i++) {
            boolean cont = true;
            for (int j = i; j < i + 2; j++) {
                if(s.charAt(j+1) - s.charAt(j) != 1) {
                    cont = false;
                    break;
                }
            }
            if(cont) {
                count++;
                if(firstOcc) {
                    firstIndex = i;
                    firstOcc = false;
                }
            }
        }
        System.out.println(count);
        System.out.println(firstIndex == -1 ? -1 : firstIndex + 1);
		input.close();
    }
}
