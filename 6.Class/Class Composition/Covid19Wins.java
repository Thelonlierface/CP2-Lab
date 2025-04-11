import java.util.ArrayList;
import java.util.Scanner;

//covid19wins1
class Visitation {
    int id;
    int date;
    int[] time;
    String name;

    Visitation(int id, int date) {
        this.id = id;
        this.date = date;
        this.time = new int[24];
    }

    void visit(int hour) {
        if(hour < 0 || hour > 23) {
            System.out.println("invalid hour: " + hour);
        }
        else {
            time[hour]++;
        }
    }

    int count() {
        int c = 0;
        for (int i = 0; i < time.length; i++) {
            if(time[i] > 0) c += time[i];
        }
        return c;
    }

    void printVisitHours() {
        //System.out.println(id);
        System.out.println(date);
        System.out.println(count());
        if(count() != 0) {
            for (int i = 0; i < time.length; i++) {
                if(time[i] != 0) System.out.print(i + " ");
            }
            System.out.println();
        }
        else {
            System.out.println("no visit");
        }
    }

    void giveName(String name) {
        this.name = name;
    }
}

//covid19wins2
class Person {
    String name;
    ArrayList<Visitation> visLog;

    Person(String name) {
        this.name = name;
        this.visLog = new ArrayList<>();
    }

    void addVisitation(Visitation vis) {
        if(vis.count() > 0) {
            visLog.add(vis);
        }
    }

    void printAllVisitations() {
        System.out.println(visLog.size());
        for (int i = 0; i < visLog.size(); i++) {
            System.out.println(visLog.get(i).name);
            visLog.get(i).printVisitHours();
        }
    }
}

public class Covid19Wins {
    // covid19wins1
    // public static void main(String[] args) {
    //     Scanner scan = new Scanner(System.in);
    //     int id = scan.nextInt();
    //     int date = scan.nextInt();
    //     final int K = scan.nextInt();
    //     Visitation visit = new Visitation(id, date);
    //     for (int i = 0; i < K; i++) {
    //         visit.visit(scan.nextInt());
    //     }
    //     visit.printVisitHours();
    // }

    // covid19wins2
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nPlaces = scan.nextInt();
        String[] places = new String[nPlaces];
        int[] initID = new int[nPlaces];
        for (int i = 0; i < places.length; i++) {
            initID[i] = scan.nextInt();
            places[i] = scan.next();
        }

        Person p = new Person(scan.next());

        int nVisits = scan.nextInt();
        for (int i = 0; i < nVisits; i++) {
            int id = scan.nextInt();
            int date = scan.nextInt();
            int target = 0;
            boolean hasTarget = false;
            for (int j = 0; j < places.length; j++) {
                if(initID[j] == id) {
                    target = j;
                    hasTarget = true;
                    break;
                }
            }
            if(hasTarget) {
                Visitation vis = new Visitation(id, date);
                int k = scan.nextInt();
                vis.giveName(places[target]);
                for (int j = 0; j < k; j++) {
                    int time = scan.nextInt();
                    if(hasTarget) {
                        vis.visit(time);
                    }
                }
                p.addVisitation(vis);
            }
            
        }

        p.printAllVisitations();
        scan.close();
    }
}
