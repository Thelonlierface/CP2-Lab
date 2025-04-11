import java.util.ArrayList;

class Student{
    public int ID;
    public String name;
    private int age;
    private int GPA;
    public ArrayList<String> subjectsLearned;
    public Student(int id, String name, int age) {
        this.ID = id;
        this.name = name;
        this.age = age;
        this.GPA = 0;
        this.subjectsLearned = new ArrayList<>();
    }

    public boolean studySubject(String subject, int scoreGot, int scorePass) { //ตัด F ที่ 25
        if(scoreGot >= scorePass) {
            subjectsLearned.add(subject);
            return true;
        }
        else {
            return false;
        }
    }

    public static int add(int a, int b) {
        return a+b;
    }
}

public class University {
    public static void main(String[] args) {
        Student fluk = new Student(670710140, "Pattaradani", 18);
        
        System.out.println(fluk.studySubject("Compro1", 79, 25));
        for (String a : fluk.subjectsLearned) {
            System.out.println(a);
        }
        System.out.println(Student.add(1, 2));
    }
}
