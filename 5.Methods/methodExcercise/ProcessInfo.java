import java.util.Scanner;

public class ProcessInfo {
    public boolean listProcesses(String[] names, int[] ramUses, int ramAvail) {
        int count = 0;
        for (int i = 0; i < ramUses.length; i++) {
            System.out.println((ramUses[i] >= 10 ? names[i] + "*" : names[i]) + " " + ramUses[i]);
            count += ramUses[i];
        }
        System.out.println(String.format("RAM used = %d out of %d", count, ramAvail));
        return count <= ramAvail;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int N = input.nextInt();
        String[] names = new String[N];
        int[] ramUses = new int[N];
        for (int i = 0; i < ramUses.length; i++) {
            names[i] = input.next();
            ramUses[i] = input.nextInt();
        }
        int totalRam = input.nextInt();
        ProcessInfo pi = new ProcessInfo();
        System.out.println(pi.listProcesses(names, ramUses, totalRam) ? "Sufficient RAM" : "Not enough RAM");
        input.close();
    }
}