import java.util.Scanner;

class HumanCharacters {
    String Name;
    String Age;
    boolean death;
    String Abilities;
    String Personality;
    String Background;

    public HumanCharacters(String name, String age, boolean death, String abilities, String personality, String Background) {
        this.Name = name;
        this.Age = age;
        this.death = death;
        this.Abilities = abilities;
        this.Personality = personality;
        this.Background = Background;
    }
}

class GodCharacters {
    String name;
    String legend;
    String abilities;
    String Personality;
    String Background;

    public GodCharacters(String name, String legend, String abilities, String personality, String Background) {
        this.name = name;
        this.legend = legend;
        this.abilities = abilities;
        this.Personality = personality;
        this.Background = Background;
    }
}

public class RecordofRagnarok {
    private static void battleROR(HumanCharacters human, GodCharacters god, int roundCount) {
        System.out.println("<>---------- Record of Ragnarok ----------<>");
        System.out.println("<< { --------- ROUND ( " + roundCount + " ) --------- } >>");
        System.out.println("<<==== GOD ====>>");
        System.out.println("Name : " + god.name );
        System.out.println("Legend : [ " + god.legend + " ]");
        System.out.println("- Abilities: " + god.abilities );
        System.out.println("- Personality: " + god.Personality );
        System.out.println("- Background: " + god.Background );
        System.out.println("VS");
        System.out.println("<<==== HUMAN ====>>");
        System.out.println("Name : " + human.Name );
        System.out.print("Age : " + human.Age );
        if ( human.death ) {
            System.out.println(" at death");
        } else {
            System.out.println("");
        }
        System.out.println("- Abilities: " + human.Abilities );
        System.out.println("- Personality: " + human.Personality );
        System.out.println("- Background: " + human.Background );
        System.out.println("<< { --------- ROUND ( " + roundCount + " ) --------- } >>");
        System.out.println("<>---------- Record of Ragnarok ----------<>");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int round = sc.nextInt();
        sc.nextLine();
        HumanCharacters[] hc = new HumanCharacters[round];
        GodCharacters[] gc = new GodCharacters[round];
        for (int i = 0; i < round; i++) {
            String Age = null;
            boolean Death = false;
            String tmp1[] = sc.nextLine().split("Age: ");
            String Name = tmp1[0].substring(0, tmp1[0].length() - 2);
            if (tmp1[1].indexOf(" at death") > 0) {
                Death = true;
                Age = tmp1[1].substring(0, 2);
            } else if (tmp1[1].indexOf("Unknown") >= 0) {
                Age = "Unknown";
            } else {
                Age = tmp1[1].substring(0, 2);
            }
            String Abilities = sc.nextLine();
            String Personality = sc.nextLine();
            String Background = sc.nextLine();
            hc[i] = new HumanCharacters(Name, Age, Death, Abilities, Personality, Background);
        }
        for (int i = 0; i < round; i++) {
            String temp = sc.nextLine();
            int startIndex = temp.indexOf('(');
            String name = temp.substring(0, startIndex).trim();
            String mythology = temp.substring(startIndex + 1, temp.length() - 1).trim();
            String Abilities = sc.nextLine();
            String Personality = sc.nextLine();
            String Background = sc.nextLine();
            gc[i] = new GodCharacters(name, mythology, Abilities, Personality, Background);
        }
        int count = 1;
        for (;;) {
            int h = sc.nextInt();
            int g = sc.nextInt();
            boolean booH = true;
            boolean booG = true;
            if (h < 0 || h >= round) {
                booH = false;
            }
            if (g < 0 || g >= round) {
                booG = false;
            }
            if (booH == true && booG == true) {
	            battleROR(hc[h], gc[g], count);
                count++;
            } else {
                sc.close();
                break;
            }
        } 
        
    }
}
/*
 * Editor's note :
 * time spent : 29.01
 * rated difficulty : ☠️☠️☠️☠️☠️
 * actual difficulty : ☠️☠️☠️☠️
 * notable things : tedious amount of info, given source code tests your ability to work on other's code, can easily get lost if you don't know what you are doing
 */