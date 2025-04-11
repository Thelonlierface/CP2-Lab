// import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//Alicarcar1
class Car {
    String name;
    int price;
    int labor;
    boolean prod;

    Car(String name, int price, int labor) {
        this.name = name;
        this.price = price;
        this.labor = labor;
        this.prod = check(name, price, labor);
    }

    static boolean check(String name, int price, int labor) {
        if (!name.isBlank() && !name.equals(null) && price > 0 && labor > 0) {
            return true;
        }
        return false;
    }
}

// Alicarcar2
class Factory {
    Car[] cars;
    boolean[] canManu;
    int totalLabor;

    Factory(Car[] cars, boolean[] canManu, int totalLabor) {
        this.cars = cars;
        this.canManu = Arrays.copyOf(canManu, cars.length);
        this.totalLabor = totalLabor;
    }
}

public class AliCarCar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        Car[] cars = new Car[N];
        // ArrayList<Car> validCars = new ArrayList<>();
        int id = 0;
        for (int i = 0; i < N; ++i) {
            String name = scan.next();
            int price = scan.nextInt();
            int labor = scan.nextInt();
            if(Car.check(name, price, labor)) {
                cars[id] = new Car(name, price, labor);
                id++;
            }
        }

        boolean[][] manu = new boolean[5][N];
        int[] laborOfFac = new int[5];
        for (int i = 0; i < 5; i++) {
            laborOfFac[i] = scan.nextInt();
            for (int j = 0; j < N; j++) {
                manu[i][j] = scan.nextInt() == 1 ? true : false;
            }
        }

        Factory[] factory = new Factory[5];
        for (int i = 0; i < factory.length; i++) {
            factory[i] = new Factory(cars, manu[i], laborOfFac[i]);
        }

        int k = scan.nextInt();
        for (int i = 0; i < k; i++) {
            int order = scan.nextInt() - 1;
            boolean success = false;
            if (cars[order] == null) {
                System.out.println("invalid model");
                continue;
            }
            for (int j = 0; j < factory.length; j++) {
                if (factory[j].canManu[order] && factory[j].totalLabor - cars[order].labor >= 0) {
                    System.out.println("okay " + (j + 1));
                    factory[j].totalLabor -= cars[order].labor;
                    success = true;
                    break;
                }
            }
            if (!success) {
                System.out.println("unable to build");
            }
        }

        scan.close();
    }
}