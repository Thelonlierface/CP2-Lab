import java.util.Scanner;

class Product {
    String name;
    int weight;
    int price;

    Product(String name, int weight, int price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }
    void printInfo() {
        System.out.println(String.format("%d grams of %s costs %d baht.", weight, name, price));
    }
}

public class ProductShipping1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            String name = in.next();
            int weight = in.nextInt();
            int price = in.nextInt();
            Product p = new Product(name, weight, price);
            p.printInfo();
        }
        in.close();
    }
}