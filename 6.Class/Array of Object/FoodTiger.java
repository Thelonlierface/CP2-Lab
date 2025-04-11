import java.util.Scanner;

class FoodShop {
    String name;
    int nFoods;
    String[] menu;

    FoodShop(String name) {
        this.name = name;
        this.menu = new String[5];
    }

    boolean addFood(String food) {
        if(nFoods < 5) {
            menu[nFoods] = food;
            nFoods++;
            System.out.print(nFoods);
            return true;
        }
        else {
            System.out.print("-1");
            return false;
        }
    }

    void printMenu() {
        System.out.print(name + " ");
        for (String m : menu) {
            System.out.print((m != null ? m : "") + " ");
        }
        System.out.println();
    }
}

public class FoodTiger {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int N = scan.nextInt();
        FoodShop[] fs = new FoodShop[N];
        for (int i = 0; i < fs.length; i++) {
            String name = scan.next();
            fs[i] = new FoodShop(name);
        }

        final int Q = scan.nextInt();
        for(int i = 0; i < Q; ++i) {
            int s = scan.nextInt() - 1;
            String food = scan.next();
            boolean ret = fs[s].addFood(food);
            System.out.println(" " + ret);
        }

        for (int i = 0; i < fs.length; i++) {
            fs[i].printMenu();
        }
        scan.close();
    }
}