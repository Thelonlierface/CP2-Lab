import java.text.DecimalFormat;
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
class Truck {
    int capacity, destination, netWeight;
    PurchaseOrder po;
    double cost;

    Truck(int capacity) {
        this.capacity = capacity;
        this.netWeight = capacity;
    }

    void add(PurchaseOrder po, int dest) {
        this.po = po;
        this.destination = dest;
        setFee();
    }

    void setFee() {
        cost = po.weight/1000.0 * destination;
    }
    
    double getFee() {
        return cost;
    }
}

public class ProductShipping3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        Truck[] trucks = new Truck[m];
        for (int i=0;i<m;i++){
            int capacity = in.nextInt();
            trucks[i] = new Truck(capacity);
        }
        int n = in.nextInt();
        int dest = in.nextInt();
        Product[] products = new Product[n];
        int[] amount = new int[n];
        for(int i=0;i<n;i++){
            String name = in.next();
            int weight = in.nextInt();
            int price = in.nextInt();
            products[i] = new Product(name,weight,price);
            amount[i] = in.nextInt();
        }
        PurchaseOrder po = new PurchaseOrder(n,products, amount);
        int minvalue = Integer.MAX_VALUE;
        int minIndex = -1;
        for (int i=0;i<m;i++){
            if((trucks[i].netWeight>=po.weight)&&(minvalue>trucks[i].netWeight)){
                minvalue = trucks[i].netWeight;
                minIndex = i;
            }
        }
        if (minIndex >= 0){
            trucks[minIndex].add(po, dest);
            System.out.println("Truck#"+ (minIndex+1));
            double fee = trucks[minIndex].getFee();
            DecimalFormat format = new DecimalFormat("0.####");
            System.out.println("Fee=" + format.format(fee));
        }
        else{
            System.out.println("No truck");
            System.out.println("Fee="+ po.weight*dest/1000.0);
        }
        in.close();
    }
}
