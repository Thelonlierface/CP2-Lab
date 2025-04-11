import java.util.ArrayList;
import java.util.Scanner;

public class InnerText {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		String s = input.nextLine();
        String rgx = input.next();
        boolean inSeq = false;
        StringBuilder res = new StringBuilder();
        ArrayList<String> seq = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            String ts = i + rgx.length() >= s.length() ? s.substring(i, s.length()): s.substring(i, i+rgx.length());
            if(ts.equals(rgx)) {
                if(inSeq) {
                    if(res.toString().isEmpty()) {
                        seq.add("_");
                    }
                    else {
                        seq.add(res.toString());
                        res.delete(0, res.length());
                    }
                    inSeq = false;
                    i += rgx.length() - 1;
                }
                else {
                    inSeq = true;
                    i += rgx.length() - 1;
                }
            }
            else {
                if(inSeq) res.append(s.charAt(i));
            }
        }
        System.out.println(seq.size());
        for (int i = 0; i < seq.size(); i++) {
            System.out.println((i+1) + " " + seq.get(i));
        }
		input.close();
    }
}