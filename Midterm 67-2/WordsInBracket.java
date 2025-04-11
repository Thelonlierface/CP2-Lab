import java.util.ArrayList;
import java.util.Scanner;

public class WordsInBracket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        ArrayList<String> res = new ArrayList<>(); //เนื่องจากว่าเราไม่ทราบว่าจะมีคำทั้งหมดกี่คำ เราจึงใช้เป็น ArrayList
        for (int i = 0;; i++) { //ทำลูปไม่รุ้จบแบบมีตัว i เพิ่มขึ้นเรื่อยๆ
            int close = s.indexOf("}", i); //เริ่มหาวงเล็บปิดตัวแรกก่อน โดยที่เลื่อนตำแหน่งที่เริ่มหาไปเรื่อยๆ
            if(close == -1) { //ถ้าไม่เจอวงเล็บปิดแล้วให้ break เลย
                break;
            }
            int open = s.substring(0, close).lastIndexOf("{"); //ตัดสตริงให้เหลือแค่จากเริ่มจนถึงวงเล็บปิด แล้วหาวงเล็บเปิดตัวสุดท้าย
            if(open == -1) { //ถ้าไม่มี ให้ไปหาวงเล็บปิดตัวถัดไป
                continue;
            }
            String init = s.substring(open + 1, close); //สตริงที่ได้จากการตัดมาแค่ส่วนที่เป็นคู่วงเล็บ
            if(!init.isEmpty() && !init.contains("{") && !init.contains("}")) { //เช็คว่ามันไม่โล่ง (ไม่ใช่ {}) และไม่มีวงเล็บอื่นคาในนั้น
                res.add(init); //เก็บคำตอบ
                s = s.substring(close + 1); //เอาส่วนที่คิดแล้วออก
                i = 0; //รีเซ็ตค่า i เนื่องจากการตัดสตริง
            }
        }
        if(res.isEmpty()) { 
            System.out.println("not found");
        }
        else {
            for (String r : res) {
                System.out.println(r);
            }
        }
        input.close();
    }
}
/*
 * ในข้อนี้ วิธีที่ใช้จะเป็นการหาวงเล็บปิดก่อน แล้วหาวงเล็บเปิดที่ใกล้ที่สุด
 * ซึ่งกรณีวงเล็บซ้อนทั้งหมดจะถูกตัดออกด้วยเงื่อนไข !init.contains("{") &&
 * !init.contains("}")
 * 
 * แนะนำให้เรียนรู้วิธีใช้ ArrayList แต่ถ้าไม่อยากใช้ สามารถใช้วิธีอื่นได้ เช่น
 * int[] res = new int[Integer.MAX_VALUE];
 * แล้วเพิ่ม count เอา
 */