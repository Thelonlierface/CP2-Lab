public class test {
    public static void main(String[] args) {
        String s = "Silpa";
        int n = 15;
        StringBuilder sb = new StringBuilder();
        /*
         * .append() เพิ่มข้อความ
         * .reverse() ย้อนข้อความ
         * .toString() แปลงกลับเป็นสตริง
         */
        sb.append(s);
        sb.reverse(); //apliS
        StringBuilder res = new StringBuilder(); //ผลลัพธ์
        do {
            res.append(s); //เพิ่ม Silpa
            res.append(sb); //เพิ่ม apliS
        } while(res.length() <= n);
        for (int i = 0; i < n; i++) {
            System.out.print(res.charAt(i));
        }
        /* 
         * while กับ  do while
         */
    }
}
