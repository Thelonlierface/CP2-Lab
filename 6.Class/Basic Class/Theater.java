import java.util.Arrays;
import java.util.Scanner;

class Theatre {
    String title;
    int price;
    boolean has3D;
    boolean hasPremiumSeats;
    int seatsAvail;
    boolean[] seatIsReserved;

    public Theatre(boolean has3D, boolean hasPremiumSeats, int seatsAvail) {
        this.has3D = has3D;
        this.hasPremiumSeats = hasPremiumSeats;
        this.seatsAvail = seatsAvail;
        this.seatIsReserved = new boolean[seatsAvail + 1];
        Arrays.fill(seatIsReserved, false);
    }

    void setTitle(String movieName) {
        if (movieName == null || movieName.isEmpty())
            this.title = "title is not set";
        else
            this.title = movieName;
    }

    void setBasePrice(int price) {
        if (price > 0)
            this.price = price;
    }

    void printInfo() {
        System.out.print(this.title.equals("title is not set") ? String.format("invalid title\n") : "");
        System.out.print(this.price == 0 ? String.format("invalid price\n") : "");
        System.out.println(this.has3D ? "3D" : "No 3D");
        System.out.println(this.hasPremiumSeats ? "Luxury" : "Standard");
        System.out.println(this.seatsAvail);
        System.out.println(this.title);
        System.out.print(this.price == 0 ? String.format("price is not set\n") : this.price);
    }

    int reserveOne(int seatNumber) {
        if (seatNumber < 1 || seatNumber >= this.seatIsReserved.length) {
            System.out.println("sorry");
            return -1;
        } else if (!this.seatIsReserved[seatNumber]) {
            this.seatIsReserved[seatNumber] = true;
            return this.price;
        } else {
            System.out.println("sorry");
            return -1;
        }
    }

    int reserveMultiple(int numSeats, int seatNumber) {
        // if(numSeats < 1 || numSeats >= this.seatIsReserved.length || seatNumber < 1
        // || seatNumber >= this.seatIsReserved.length || seatNumber + numSeats >
        // this.seatIsReserved.length) {
        if (numSeats < 1 || seatNumber + numSeats - 1 >= seatIsReserved.length || seatNumber < 1
                || seatNumber >= seatIsReserved.length - 1) {
            System.out.println("sorry");
            return -1;
        }
        for (int i = seatNumber; i < numSeats + seatNumber; i++) {
            if (this.seatIsReserved[i] == true) {
                for (int j = seatNumber; j < i; j++) {
                    this.seatIsReserved[j] = false;
                }
                System.out.println("sorry");
                return -1;
            } else {
                this.seatIsReserved[i] = true;
            }
        }
        return this.price * numSeats;
    }
}

public class Theater {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int threeD1 = scan.nextInt();
        int luxury1 = scan.nextInt();
        int numSeats = scan.nextInt();
        boolean threeD = false;
        boolean luxury = false;
        if (threeD1 == 1)
            threeD = true;
        if (luxury1 == 1)
            luxury = true;
        Theatre t = new Theatre(threeD, luxury, numSeats);

        scan.nextLine(); // throw away new line character
        String title = scan.nextLine();
        t.setTitle(title);

        int basePrice = scan.nextInt();
        t.setBasePrice(basePrice);

        int N = scan.nextInt();
        for (int i = 0; i < N; ++i) {
            int numberOfSeats = scan.nextInt();
            int seatNumber = scan.nextInt();
            int totalPrice;
            if (numberOfSeats == 1)
                totalPrice = t.reserveOne(seatNumber);
            else
                totalPrice = t.reserveMultiple(numberOfSeats, seatNumber);
            if (totalPrice > 0)
                System.out.println(totalPrice);
        }

        t.printInfo();
        scan.close();
    }
}
