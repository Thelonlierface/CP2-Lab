import java.util.Scanner;

class WaterTank {
    int width;
    int length;
    int height;
    int capacity;
    int volume;

    public WaterTank(int w, int l, int h) {
        this.width = w;
        this.height = h;
        this.length = l;
        this.capacity = w*l*h;
        this.volume = 0;
    }

    public int fill(int amount) {
        if(amount + this.volume > this.capacity) {
            System.out.println("Cannot fill the tank");
            return -1;
        }
        else {
            this.volume += amount;
            return this.volume;
        }
    }
}

public class TankObserver {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int width = scan.nextInt();
        int length = scan.nextInt();
        int height = scan.nextInt();
        WaterTank tank = new WaterTank(width, length, height);
        for(int i = 0; i < 5; ++i) {
            int amount = scan.nextInt();
            System.out.println(tank.fill(amount));
        }
        scan.close();
    }
}
