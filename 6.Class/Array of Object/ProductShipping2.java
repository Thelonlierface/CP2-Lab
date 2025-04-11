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

class PurchaseOrder {
    int productAmount;
    Product[] products;
    int[] productStock;
    int price;
    int weight;

    PurchaseOrder(int productAmount, Product[] products, int[] productStock) {
        this.productAmount = productAmount;
        this.products = products;
        this.productStock = productStock;
        for (int i = 0; i < productStock.length; i++) {
            this.price += products[i].price * productStock[i];
            this.weight += products[i].weight * productStock[i];
        }
    }

    void printInfo() {
        System.out.println(String.format("%d items = %d baht %d grams", productAmount, price, weight));
        for (int i = 0; i < productAmount; i++) {
            System.out.println(String.format("%s %dx%d = %d", products[i].name, productStock[i], products[i].price, 
                    products[i].price * productStock[i]));
        }
    }
}

public class ProductShipping2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Product[] products = new Product[n];
        int[] amount = new int[n];
        for (int i = 0; i < n; i++) {
            String name = in.next();
            int weight = in.nextInt();
            int price = in.nextInt();
            products[i] = new Product(name, weight, price);
            amount[i] = in.nextInt();
        }
        PurchaseOrder po = new PurchaseOrder(n, products, amount);
        po.printInfo();
        in.close();
    }
}