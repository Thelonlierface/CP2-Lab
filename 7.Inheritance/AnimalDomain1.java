import java.util.Scanner;

class Animal {
    public String name;
    public int lifeExpect;
    public int age;

    public Animal(String n, int le) {
        this.name = n;
        this.lifeExpect = le;
        System.out.println(this.name + " was born with life expectancy " + this.lifeExpect + " year(s)");
    }

    public void live(int year) {
        /*
         * possible outcomes :
         * <Name> lived <year> more years
         * <Name> lived <year> more years and died
         * <Name> lived 1 more year
         * <Name> lived 1 more year and died
         * <Name> died earlier //
         */
        if (this.age >= this.lifeExpect) {
            System.out.println(this.name + " died earlier");
        } else {
            if (this.lifeExpect - this.age == 1 || year == 1) {
                if (this.age + year < this.lifeExpect) {
                    System.out.println(this.name + " lived 1 more year");
                } else {
                    System.out.println(this.name + " lived 1 more year and died");
                }
            } else {
                if (this.age + year < this.lifeExpect) {
                    System.out.println(this.name + " lived " + year + " more years");
                } else {
                    System.out.println(this.name + " lived " + (this.lifeExpect - this.age) + " more years and died");
                }
            }
        }
        this.age += year;
    }

    public boolean isAlive() {
        boolean isA = this.age < this.lifeExpect;
        if (isA) {
            System.out.println(this.name + " is alive");
        } else {
            System.out.println(this.name + " is dead");
        }
        return this.age < this.lifeExpect;
    }
}

public class AnimalDomain1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Animal[] animal = new Animal[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            int command = input.nextInt();
            switch (command) {
                case 1:
                    String name = input.next();
                    int le = input.nextInt();
                    animal[count] = new Animal(name, le);
                    count++;
                    break;
                case 2:
                    int a_num = input.nextInt() - 1;
                    int year = input.nextInt();
                    animal[a_num].live(year);
                    break;
                case 3:
                    int ani_num = input.nextInt() - 1;
                    animal[ani_num].isAlive();
                    break;
            }
        }
        input.close();
    }
}