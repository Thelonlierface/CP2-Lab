import java.util.ArrayList;
import java.util.Scanner;

class Kaiju {
    String name;
    String category;
    int height;
    int weight;
    ArrayList<String> powers = new ArrayList<>();
    String details;
    public Kaiju() {
        this.name = "Unknown";
        this.category = "Unknown";
        this.height = -1;
        this.weight = -1;
        this.details = "Unknown";
    }
    public Kaiju(String name) {
        this.name = name;
        this.category = "Unknown";
        this.height = -1;
        this.weight = -1;
        this.details = "Unknown";
    }
    public Kaiju(String name, String Cat, int height, int weight, String[] power, String desc) {
        this.name = name;
        this.category = Cat;
        this.height = height;
        this.weight = weight;
        for (int i = 0; i < power.length; i++) {
            this.powers.add(power[i]);
        }
        this.details = desc;
    }

    public void PrintDetail() {
        System.out.println("Kaiju : " + this.name);
        System.out.printf("< Category: Category %s >\n", this.category);
        System.out.println("Height: " + (this.height == -1 ? "Unknown" : this.height + " feet " + "(" + (this.height / 3.2808) + " meters)") );
        System.out.println("Weight: " + (this.weight == -1 ? "Unknown" : this.weight + " tons"));
        if(!this.powers.isEmpty()) {
            System.out.println("Power: [" + this.powers.size() + "] :");
            for (String p : this.powers) {
                System.out.println(p);
            }
        }
        else {
            System.out.println("Power: Unknown");
        }
        System.out.println("Description: " + this.details);
    }
}

class Jaeger {
    String name;
    String countryManufactured;
    int mark;
    double height;
    ArrayList<String> pilot = new ArrayList<>();
    ArrayList<String> weapons = new ArrayList<>();

    public Jaeger() {
        this.name = "Unknown";
        this.countryManufactured = "Unknown";
        this.mark = -1;
    }
    public Jaeger(String name) {
        this.name = name;
        this.countryManufactured = "Unknown";
        this.mark = -1;
        this.height = -1;
    }
    public Jaeger(String name, String CoO, int mark, double h, String[] strp, String[] strw) {
        this.name = name;
        this.countryManufactured = CoO;
        this.mark = mark;
        this.height = h;
        for (int i = 0; i < strp.length; i++) {
            this.pilot.add(strp[i]);
        }
        for (int i = 0; i < strw.length; i++) {
            this.weapons.add(strw[i]);
        }
    }

    public void PrintDetail() {
        System.out.println("Jaegers : " + this.name);
        System.out.println("< Country of Origin: " + this.countryManufactured + " >");
        System.out.println("< Mark: " + (this.mark <= 0 ? "Unknown" : "Mark-" + this.mark) + " >");
        System.out.println("Height: " + (this.height <= 0 ? "Unknown" :  + this.height + " meters "));
        if(!this.pilot.isEmpty()) {
            System.out.printf("Pilots: [%d] :\n", this.pilot.size());
            for (String p : this.pilot) {
                System.out.println(p);
            }
        }
        else {
            System.out.println("Pilots: Unknown");
        }
        if(!this.weapons.isEmpty()) {
            System.out.printf("Weapons: [%d] :\n", this.weapons.size());
            for (String w : this.weapons) {
                System.out.println(w);
            }
        }
        else {
            System.out.println("Weapons: Unknown");
        }
    }
}

public class PacificRim {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Jaeger j = null;
        Kaiju k = null;

        int typeK = sc.nextInt();
        if (typeK == 0) {
            k = new Kaiju();
        } else if (typeK == 1) {
            String name = sc.next();
            k = new Kaiju(name);
        } else if (typeK == 2) {
            String name = sc.next();
            String Category = sc.next();
            int Height = sc.nextInt();
            int Weight = sc.nextInt();
            String strp = sc.nextLine();
            strp = sc.nextLine();
            String Power[] = strp.split(",");
            String Description = sc.nextLine();
            k = new Kaiju(name, Category, Height, Weight, Power, Description);
        }

        int typeJ = sc.nextInt();

        if (typeJ == 0) {
            j = new Jaeger();
        } else if (typeJ == 1) {
            String t = sc.nextLine();
            String name = sc.nextLine();
            j = new Jaeger(name);
        } else if (typeJ == 2) {
            String temp = sc.nextLine();
            String name = sc.nextLine();
            String CoO = sc.nextLine();
            int mark = sc.nextInt();
            double h = sc.nextDouble();
            temp = sc.nextLine();
            String str = sc.nextLine();
            String strp[] = str.split(",");
            String str2 = sc.nextLine();
            String strw[] = str2.split(",");
            j = new Jaeger(name, CoO, mark, h, strp, strw);
        }

        System.out.println("====================");
        j.PrintDetail();
        System.out.println("VS");
        k.PrintDetail();
        System.out.println("====================");

    }
}
/*editor's note:
 *   dificulty level given : 5 skulls
 *   actual difficulty level : roughly 2 skulls
 *   tedious level : fuck you
 *   it's not hard, it's just fuck you amount of data that you need to go through, and is extremely time consuming -> could be devastating in exams
 */