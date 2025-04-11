import java.util.ArrayList;
import java.util.Scanner;

class Demons {

    private String name;
    private int Hp;
    private String Background;

    public Demons(String name, int Hp, String Background) {
        this.name = name;
        this.Hp = Hp;
        this.Background = Background;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return Hp;
    }

    public String getBackground() {
        return Background;
    }

    public void setHp(int Hp) {
        this.Hp = Hp;
    }

}

class Muzan extends Demons {
    String alias;
    String gender;
    private int muzanBlood;
    public int power;
    public Muzan(String name, int[] hp, String backStory, int transform) {
        super(name, hp[transform]/2, backStory);
        this.alias = transform == 0 ? "Child" : (transform == 1 ? "Geisha" : "The King of Demons");
        this.gender = transform == 1 ? "Female" : "Male";
        this.muzanBlood = hp[transform]/2;
        this.power = (this.muzanBlood + super.getHp())*50;
    }

    public Muzan(String name) {
        super(name, 0, "Unknown");
    }

    int Blood() {
        int hpLoss = (int)(0.1*muzanBlood);
        if(0.1*muzanBlood > 0) {
            muzanBlood -= hpLoss;
            this.power = (this.muzanBlood + super.getHp()) * 50;
        }
        return hpLoss;
    }

    void printInfo() {
        System.out.println(getName() + " ( " + alias + " )");
        System.out.println("Gender : " + gender);
        System.out.println("HP : " + getHp());
        System.out.println("Blood : "  + muzanBlood);
        System.out.println("Power : " + power);
        System.out.println("Background : " + getBackground());
    }
}

class DemonMoons_UpperRanks extends Muzan {
    public int rank;

    DemonMoons_UpperRanks(String name, int rank, int muzanBlood) {
        super(name);
        setHp(rank*muzanBlood*75);
        super.power = muzanBlood*rank*50;
        this.rank = rank;
    }

    int Blood(int muzanBlood) {
        super.setHp(getHp() + muzanBlood*75);
        super.power += muzanBlood * 50;
        return (int) (0.1 * muzanBlood);
    }

    void printInfo() {
        System.out.println("Name : " + getName());
        System.out.println("Upper Rank : " + rank); 
        System.out.println("Power : "  + power);
        System.out.println("HP : " + getHp());
        System.out.println("Background : " + getBackground());
    }
}

class DemonMoons_LowerRanks extends Muzan {
    public int rank;

    DemonMoons_LowerRanks(String name, int rank, int muzanBlood) {
        super(name);
        setHp(rank*muzanBlood*50);
        super.power = muzanBlood*rank*25;
        this.rank = rank;
    }

    int Blood(int muzanBlood) {
        super.setHp(getHp() + muzanBlood*50);
        super.power += muzanBlood * 25;
        return (int) (0.1 * muzanBlood);
    }

    void printInfo() {
        System.out.println("Name : " + getName());
        System.out.println("Lower Ranks : " + rank); 
        System.out.println("Power : "  + power);
        System.out.println("HP : " + getHp());
        System.out.println("Background : " + getBackground());
    }
}

public class TwelveDemonMoons {

    private static ArrayList<Muzan> DemonMoons = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int hp[] = new int[3];
        for (int i = 0; i < 3; i++) {
            hp[i] = sc.nextInt();
        }
        String t = sc.nextLine();
        String bg = sc.nextLine();
        int type = sc.nextInt();
        Muzan muzun = new Muzan(name, hp, bg, type);
        for (;;) {
            int type_demon = sc.nextInt();
            if (type_demon == 0) {
                break;
            } else if (type_demon > 0) {
                String n = sc.next();
                int rank = sc.nextInt();
                int blood = muzun.Blood();
                Muzan upper = new DemonMoons_UpperRanks(n, rank, blood);
                DemonMoons.add(upper);

            } else {
                String n = sc.next();
                int rank = sc.nextInt();
                int blood = muzun.Blood();
                Muzan lower = new DemonMoons_LowerRanks(n, rank, blood);
                DemonMoons.add(lower);
            }
        }

        int com = sc.nextInt();
        for (int i = 0; i < com; i++) {
            int id = sc.nextInt() - 1;
            int blood = muzun.Blood();
            if (DemonMoons.get(id) instanceof DemonMoons_UpperRanks) {
                DemonMoons_UpperRanks up = (DemonMoons_UpperRanks) DemonMoons.get(id);
                up.Blood(blood);
                DemonMoons.set(id, up);

            } else if (DemonMoons.get(id) instanceof DemonMoons_LowerRanks) {
                DemonMoons_LowerRanks low = (DemonMoons_LowerRanks) DemonMoons.get(id);
                low.Blood(blood);
                DemonMoons.set(id, low);

            }
        }
        muzun.printInfo();
        for (Muzan x : DemonMoons) {
            if (x instanceof DemonMoons_UpperRanks) {
                DemonMoons_UpperRanks up = (DemonMoons_UpperRanks) x;
                up.printInfo();
            } else if (x instanceof DemonMoons_LowerRanks) {
                DemonMoons_LowerRanks low = (DemonMoons_LowerRanks) x;
                low.printInfo();
            }
        }

    }
}