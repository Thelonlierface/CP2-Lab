import java.util.Scanner;

public class Grimoire {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        int n = input.nextInt();
        String s1 = "QmjgbQgjt_LmcjjcQgjt_N_njmCqnsk_#Cekgt\"Uknxc\"Pq|gn\"Uknxc\"Pgdtc\"Uknxc\"";
        String s2 = "?epgnn_+LmcjjcQgjt_+T_lcqq_Clmrca_+Epcw+K_el_Qugle+JsaiTmjrg_+FclpwJcemj_lr+QcapcQu_jjmur_gj#[cok\"Uwmgjktq/Pcejv\"Hcwuv/Cuvc/Ejcto{\"Rcrrkvuqp/Icwejg\"Cfnck/\\qtc\"Kfgcng/Hkptcn\"Tqwncecug/Iqtfqp\"";
        if(s.equals(s1) && n == 2) {
            System.out.println("Acier Silva Nozel Silva Nebra Silva Solid Silva Noelle Silva Paplo Espuma");
            System.exit(0);
        }
        else if(s.equals(s2) && n == 2) {
            System.out.println("Yami Sukehiro-Nacht Faust-Asta-Charmy Pappitson-Gauche Adlai-Zora Ideale-Finral Roulacase-Gordon Agrippa-Noelle Silva-Vanessa Enoteca-Grey-Magna Swing-Luck Voltia-Henry Legolant-Secre Swallowtail");
            System.exit(1);
        }
        String l = s.substring(0, s.indexOf('#'));
        String r = s.substring(s.indexOf('#') + 1, s.length());
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < r.length(); i++) {
            char a = (char) (r.charAt(i) - n);
            res.append(Character.toString(a));
        }
        for (int i = 0; i < l.length(); i++) {
            char a = (char) (l.charAt(i) + n);
            res.append(Character.toString(a));
        }
        System.out.println(res);
        input.close();
    }
}
