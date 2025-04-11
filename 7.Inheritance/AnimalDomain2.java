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
        if(this.age > this.lifeExpect) {
            this.age = this.lifeExpect;
        }
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

    public void vaccine() {
        System.out.println(this.name + "'s life expectancy is now " + this.lifeExpect + " year(s)");
    }
}

class Dog extends Animal {
    private boolean isVaccinated = false;
    public Dog(String name) {
        super(name, 8);
    }
    @Override public void vaccine() {
        if(!isVaccinated) {
            int additionalYears = this.lifeExpect - this.age;
            this.lifeExpect += additionalYears;
        }
        super.vaccine();
        isVaccinated = true;
    }
}

class Turtle extends Animal {
    public Turtle(String name) {
        super(name, 50);
    }
}

class Salmon extends Animal {
    public Salmon(String name) {
        super(name, 4);
    }
}

public class AnimalDomain2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Animal[] animal = new Animal[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            int command = input.nextInt();
            switch (command) {
                case 1:
                    int type = input.nextInt();
                    String name = input.next();
                    switch (type) {
                        case 1 : animal[count] = new Dog(name); break;
                        case 2 : animal[count] = new Turtle(name); break;
                        case 3 : animal[count] = new Salmon(name); break;
                    }
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
                case 4:
                    int animal_num = input.nextInt() - 1;
                    animal[animal_num].vaccine();
                    break;
            }
        }
        input.close();
    }
}
