import java.util.Scanner;

//ComSpec1
class CPU {
    public String model;
    public int clocks;
    public int socket;
    public int memType;
    public boolean valid;
    
    CPU(String model, int clocks, int socket, int memType) {
        this.model = model;
        this.clocks = clocks;
        this.socket = socket;
        this.memType = memType;
        this.valid = isValidSpec(model, clocks, socket, memType);
    }
    
    boolean isValidSpec(String model, int clocks, int socket, int memType) {
        return model != null && !model.isBlank() && clocks > 0 && socket > 0 && memType > 0 && memType <= 10;
    }

    void printInfo() {
        System.out.println(model);
        System.out.println(clocks);
        System.out.println(socket);
        System.out.println(memType);
        System.out.println(valid);
    }
}

//comspec2
class Mainboard {
    public String model;
    public int socket;
    public int memType;
    public boolean valid;
    
    Mainboard(String model, int socket, int memType) {
        this.model = model;
        this.socket = socket;
        this.memType = memType;
        this.valid = isValidSpec(model, memType, socket, memType);
    }

    boolean isValidSpec(String model, int clocks, int socket, int memType) {
        return model != null && !model.isBlank() && socket > 0 && memType > 0 && memType <= 10;
    }

    void printInfo() {
        System.out.println(model);
        System.out.println(socket);
        System.out.println(memType);
        System.out.println(valid);
    }
}

class Computer {
    CPU cpu;
    Mainboard mb;
    boolean valid;

    Computer(CPU cpu, Mainboard mb) {
        this.cpu = cpu;
        this.mb = mb;
        this.valid = isValidCom(cpu, mb);
    }

    boolean isValidCom(CPU cpu, Mainboard mb) {
        return cpu.socket == mb.socket && cpu.memType == mb.memType && cpu.valid && mb.valid;
    }

    void printInfo() {
        if(valid) {
            System.out.println(cpu.model);
            System.out.println(cpu.clocks);
            System.out.println(mb.model);
            System.out.println(mb.socket);
            System.out.println(mb.memType);
        }
        else {
            System.out.println("Invalid Spec");
            cpu.printInfo();
            mb.printInfo();
        }
    }
}

public class ComSpec {
    public static void main(String[] args) {
        //cpuspec1
        Scanner input = new Scanner(System.in);
        String model = input.nextLine();
        int clocks = input.nextInt();
        int socket = input.nextInt();
        int memType = input.nextInt();

        if(model.length() == 0 && socket % 2 == 0) {
            model = null;
        }
        CPU cpu = new CPU(model, clocks, socket, memType);
        
        //cpuspec2
        input.nextLine();
        model = input.nextLine();
        socket = input.nextInt();
        memType = input.nextInt();
        if(model.length() == 0 && socket % 2 == 0) {
            model = null;
        }
        Mainboard mb = new Mainboard(model, socket, memType);

        Computer pc = new Computer(cpu, mb);
        pc.printInfo();
        input.close();
    }
}
