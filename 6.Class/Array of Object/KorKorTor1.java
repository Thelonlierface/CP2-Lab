import java.util.ArrayList;
import java.util.Scanner;

class Party {
    String name;
    int partySize;
    ArrayList<String> firstName;
    ArrayList<String> lastName;
    ArrayList<Integer> regionNumber;

    public Party(String name, int partySize) {
        this.name = name;
        this.partySize = partySize;
        firstName = new ArrayList<>();
        lastName = new ArrayList<>();
        regionNumber = new ArrayList<>();
    }

    void addMember(String fN, String lN, int rN) {
        firstName.add(fN);
        lastName.add(lN);
        regionNumber.add(rN);
    }

    void printInfo(int region) {
        if(region == 0) {
            for (int i = 0; i < firstName.size(); i++) {
                System.out.println(firstName.get(i) + " " + lastName.get(i) + " " + regionNumber.get(i));
            }
        }
        else if(region > 0){
            boolean found = false;
            for (int i = 0; i < regionNumber.size(); i++) {
                if(regionNumber.get(i) == region) {
                    found = true;
                    System.out.println(firstName.get(i) + " " + lastName.get(i));
                }
            }
            if(!found) {
                System.out.println("none");
            }
        }
        else {
            System.out.println("invalid region number");
        }
    }
}

public class KorKorTor1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Party[] party = new Party[n];
        for (int i = 0; i < party.length; i++) {
            String partyName = scan.next();
            int partySize = scan.nextInt();
            party[i] = new Party(partyName, partySize);
        }
        for (int i = 0; i < party.length; i++) {
            for (int j = 0; j < party[i].partySize; j++) {
                String firstName = scan.next();
                String lastName = scan.next();
                int regionNumber = scan.nextInt();
                party[i].addMember(firstName, lastName, regionNumber);
            }
        }
        // โค้ดส าหรับอ่านตัวทดสอบ printInfo
        final int K = scan.nextInt();
        for (int i = 0; i < K; ++i) {
            int partyNumber = scan.nextInt()-1;
            int regionNumber = scan.nextInt();
            party[partyNumber].printInfo(regionNumber);
        }
        scan.close();
    }
}
