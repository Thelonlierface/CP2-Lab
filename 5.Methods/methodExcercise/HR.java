import java.util.Scanner;

class Employee {
    String name;
    String ID;
    int type;
    int wage;
    int exWork;
    int opWork;

    public Employee(String name, String id, int type, int wage) {
        this.name = name;
        this.ID = id;
        this.type = type;
        this.wage = wage;
    }

    public boolean workExecutive(int hour) {
        if(hour <= 0) {
            System.out.println("Invalid hour for executive work");
            return false;
        }
        else {
            this.exWork += hour;
            return true;
        }
    }

    public boolean workOperation(int hour) {
        if(hour <= 0) {
            System.out.println("Invalid hour for operation work");
            return false;
        }
        else {
            this.opWork += hour;
            return true;
        }
    }

    public int calPayment() {
        int ex = type == 1 ? this.exWork * this.wage : (this.exWork * this.wage * 2);
        int op = type == 2 ? this.opWork * this.wage : (this.opWork * this.wage * 2);
        return ex + op;
    }

    public void printStats() {
        System.out.println(String.format("ID: %s\nName: %s\nPosition: %s\nEx Hour: %d\nOp Hour: %d\nWage: %d\nPayment: %d" , this.ID, this.name, (this.type == 1 ? "Executive" : "Operation"),this.exWork, this.opWork, this.wage, this.calPayment()));
    }
}

public class HR {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        String ID = scan.next();
        int type = scan.nextInt();
        int wage = scan.nextInt();
        Employee employee = new Employee(name, ID, type, wage);
        final int N = scan.nextInt();
        for(int i = 0; i < N; ++i) {
            int workType = scan.nextInt();
            int hour = scan.nextInt();
            if(workType == 1) {
                System.out.println(employee.workExecutive(hour) + " " + employee.calPayment());
            }
            else System.out.println(employee.workOperation(hour) + " " + employee.calPayment());
        }
        employee.printStats();
        scan.close();
    }
}
