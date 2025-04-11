import java.util.ArrayList;
import java.util.Scanner;
//store1
class ProductInfo {
    public String name;
    public int minPrice, maxPrice;

    public ProductInfo(String name, int[] prices) {
        this.name = name;
        this.minPrice = prices[0];
        this.maxPrice = prices[0];
        for (int i = 1; i < prices.length; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            maxPrice = Math.max(maxPrice, prices[i]);
        }
    }

    public void printInfo() {
        System.out.println(name + " " + minPrice + " " + maxPrice);
    }
}
//store2
class Store {
    ArrayList<ProductInfo> products = new ArrayList<>();

    void enterProductInfo(ProductInfo prod) {
        products.add(prod);
    }

    void printAllProductInfo() {
        for (int i = 0; i < products.size(); i++) {
            products.get(i).printInfo();
        }
    }
    //store3
    ArrayList<ProductInfo> search(String prodName) {
        ArrayList<ProductInfo> res = new ArrayList<>();
        for (int i = 0; i < products.size(); i++) {
            if(products.get(i).name.contains(prodName)) {
                res.add(products.get(i));
            }
        }
        return res;
    }
}

public class Stores {
    // psvm for store1
    // public static void main(String[] args) {
    //     Scanner scan = new Scanner(System.in);
    //     String name = scan.next();
    //     int N = scan.nextInt();
    //     int[] prices = new int[N];
    //     for(int i = 0; i < N; ++i) {
    //         prices[i] = scan.nextInt();
    //     }
    //     ProductInfo pInfo = new ProductInfo(name, prices);
    //     pInfo.printInfo();
    //     scan.close();
    // }

    // psvm for store2
    // public static void main(String[] args) {
    //     Scanner scan = new Scanner(System.in);
    //     Store store = new Store();
    //     int K = scan.nextInt();
    //     for (int i = 0; i < K; ++i) {
    //         String name = scan.next();
    //         int N = scan.nextInt();
    //         int[] prices = new int[N];
    //         for(int j = 0; j < N; ++j) {
    //             prices[j] = scan.nextInt();
    //         }
    //         ProductInfo pInfo = new ProductInfo(name, prices);
    //         store.enterProductInfo(pInfo);
    //     }
    //     store.printAllProductInfo();
    //     scan.close();
    // }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Store store = new Store();
        int K = scan.nextInt();
        for (int i = 0; i < K; ++i) {
            String name = scan.next();
            int N = scan.nextInt();
            int[] prices = new int[N];
            for(int j = 0; j < N; ++j) {
                prices[j] = scan.nextInt();
            }
            ProductInfo pInfo = new ProductInfo(name, prices);
            store.enterProductInfo(pInfo);
        }
        String productName = scan.next();
        // Enter your code below here, do not change the above.
        ArrayList<ProductInfo> res = store.search(productName);
        System.out.println(res.size());
        if(res.size() == 0) System.out.println("product not found");
        else {
            for (int i = 0; i < res.size(); i++) {
                res.get(i).printInfo();
            }
        }
        
        scan.close();
    }

}