import java.util.Scanner;

public class GeneticCode_Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		String s = input.nextLine();
        while(s.indexOf("<") != -1 || s.indexOf(">") != -1) {
            String dna = s.indexOf(">") == s.length() - 1 ? s.substring(s.indexOf("<"), s.length()) : s.substring(s.indexOf("<"), s.indexOf(">") + 1);
            String cnvDNA = "";
            switch (dna) {
                case "<UAA>":
                    cnvDNA = "ochre";
                    break;
                case "<UAG>":
                    cnvDNA = "amber";
                    break;
                case "<UGA>":
                    cnvDNA = "opal";
                    break;
                default:
                    cnvDNA = "unknown";
                    break;
            }
            s = s.replace(dna, cnvDNA);
        }
        System.out.println(s);
        input.close();
    }
}
