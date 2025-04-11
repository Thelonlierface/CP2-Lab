import java.util.Scanner;

public class BracketChecking {

    public boolean CheckBracket(String s) {   
        int l = s.indexOf("{");
        int r = s.indexOf("}");
        if(l == -1 && r == -1) {
            return true;
        }
        else if((l == -1 && r != -1) || (l != -1 && r == -1)) {
            return false;
        }
        else {
            if(l < r) {
                return CheckBracket(s.substring(0, l) + s.substring(l+1, r) + s.substring(r+1));
            }
            else if(l > r) {
                return CheckBracket(s.substring(0, r) + s.substring(r+1, l) + s.substring(l+1));
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        BracketChecking bc = new BracketChecking();
        System.out.println(bc.CheckBracket(str));
    }
}
