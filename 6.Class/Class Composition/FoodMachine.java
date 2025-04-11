import java.util.Scanner;

class Content {
    String name;
    int price;

    Content(String name, int price) {
        this.name = name;
        this.price = price;
    }

    void updatePrice(int newPrice) {
        if(newPrice > 0) {
            this.price = newPrice;
        }
    }

    void printSummary() {
        System.out.println(name + " " + price);
    }
}

class Food {
    String name;
    Content[] contents;

    Food(String name, Content[] contents) {
        this.name = name;
        this.contents = contents;
    }

    void printSummary() {
        int totalPrice = 0;
        for (int i = 0; i < contents.length; i++) {
            totalPrice += contents[i].price;
        }
        System.out.println(name + " " + totalPrice);
    }
}

public class FoodMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numContents = sc.nextInt();
        Content[] contents = new Content[numContents];
        for (int i = 0; i < contents.length; ++i) {
            String name = sc.next();
            int price = sc.nextInt();
            contents[i] = new Content(name, price);
        }
        int numFoods = sc.nextInt();
        Food[] foods = new Food[numFoods];
        for (int i = 0; i < foods.length; ++i) {
            String name = sc.next();
            int numFoodContents = sc.nextInt();
            Content[] foodContents = new Content[numFoodContents];
            for (int j = 0; j < foodContents.length; ++j) {
                int contentId = sc.nextInt();
                foodContents[j] = contents[contentId];
            }
            foods[i] = new Food(name, foodContents);
        }
        int q = sc.nextInt();
        while (true) {
            if(q == -1) {
                for (int i = 0; i < foods.length; i++) {
                    foods[i].printSummary();
                }
                break;
            }
            else {
                int np = sc.nextInt();
                contents[q].updatePrice(np);
                contents[q].printSummary();
            }
            q = sc.nextInt();
        }
        sc.close();
    }
}
