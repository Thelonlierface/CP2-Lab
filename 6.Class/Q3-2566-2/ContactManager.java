import java.util.ArrayList;
import java.util.Scanner;

class ContactBook {
    ArrayList<String> name = new ArrayList<>();
    ArrayList<String> phoneNo = new ArrayList<>();

    public ContactBook(String[] names, String[] number) {
        for (int i = 0; i < number.length; i++) {
            this.name.add(names[i]);
            this.phoneNo.add(number[i]);
        }
    }

    public void getAllContacts() {
        for (int i = 0; i < this.phoneNo.size(); i++) {
            System.out.println(this.name.get(i) + " " + this.phoneNo.get(i));
        }
    }

    public void getContact(String name) {
        int index = this.name.indexOf(name);
        System.out.println(index == -1 ? "Invalid contact" : this.phoneNo.get(index));
    }

    public static boolean onlydigits(String phoneNum) {
        return phoneNum.matches("[0-9]+");
    }

    public void editNumber(String targetName, String newNumber) {
        int index = this.name.indexOf(targetName);
        if(index == -1) {
            System.out.println("Invalid contact");
        }
        else {
            if(newNumber.length() >= 9 && newNumber.length() <= 10 && newNumber.charAt(0) == '0' && onlydigits(newNumber)) {
                this.phoneNo.set(index, newNumber);
                System.out.println(this.name.get(index) + " new number is " + this.phoneNo.get(index));
            }
            else {
                System.out.println("Invalid number");
            }
        }
    }
}

public class ContactManager {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String[] names = new String[n];
        String[] pn = new String[n];
        for (int i = 0; i < n; i++) {
            names[i] = input.next();
            pn[i] = input.next();
        }
        ContactBook cb = new ContactBook(names, pn);
        int ncmd = input.nextInt();
        for (int i = 0; i < ncmd; i++) {
            int cmd = input.nextInt();
            String targetName;
            String targetNum;
            switch (cmd) { 
                case 1:
                    targetName = input.next();
                    cb.getContact(targetName);
                    break;
                case 2:
                    targetName = input.next();
                    targetNum = input.next();
                    cb.editNumber(targetName, targetNum);
                    break;
                case 3:
                    cb.getAllContacts();
                    break;
                default:
                    System.out.println("Invalid command");
                    break;
            }
        }
        input.close();
    }
}