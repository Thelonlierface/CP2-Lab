import java.util.Scanner;

class TaoKlingOrder {
    int numMilk;
    int numJuice;
    int numMineralWater;
    int total;
    String phoneNumber;
    String code;
    boolean completed;

    public TaoKlingOrder(String phoneNo, int n1, int n2, int n3, String code) {
        this.phoneNumber = phoneNo;
        if(this.phoneNumber.charAt(0) != '0' || this.phoneNumber.length() != 10) {
            System.out.println("invalid phone number");
            this.phoneNumber = "0#########";
        }
        this.numMilk = n1 <= 0 ? 0 : n1;
        this.numJuice = n2 <= 0 ? 0 : n2;
        this.numMineralWater = n3 <= 0 ? 0 : n3;
        this.code = code;
        this.completed = false;
        this.total = this.numMilk*10 + this.numJuice*20 + this.numMineralWater*15;
    }

    public boolean grabOrder(String phoneNo, String code) {
        if(phoneNo.equals(this.phoneNumber) && code.equals(this.code)) {
            completed = true;
        }
        return completed;
    }

    public void printInfo() {
        System.out.println(this.phoneNumber + " " + this.numMilk + " " + this.numJuice + " " + this.numMineralWater + " " + this.total + " " + (this.completed ? "Y" : "N"));
    }
}

public class TaoKling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String phoneNo = sc.next();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        String code = sc.next();
        TaoKlingOrder t = new TaoKlingOrder(phoneNo, n1,n2,n3,code);
        String phone = sc.next();
        String code1 = sc.next();
        boolean flag = t.grabOrder(phone,code1);
        System.out.println(flag);
        t.printInfo();
        sc.close();
    }
}