import java.util.ArrayList;
import java.util.Scanner;

public class ArrayAccess {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        for (int i = 0; i<n; ++i) {
            int m = input.nextInt();
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j<m; ++j) {
                row.add(input.nextInt());
            }
            arr.add(row);
        }
        int total = 0;
        int max = -1;
        int min = Integer.MAX_VALUE;
        int error = 0;
        while (true) { 
            int arrNum = input.nextInt() - 1;
            if(arrNum == -1) {
                input.close();
                break;
            }
            int index = input.nextInt();
            if(arrNum >= arr.size() || arrNum < 0 || index >= arr.get(arrNum).size() || index < 0) {
                error++;
                continue;
            }
            total += arr.get(arrNum).get(index);
            if(arr.get(arrNum).get(index) > max) {
                max = arr.get(arrNum).get(index);
            }
            if(arr.get(arrNum).get(index) < min) {
                min = arr.get(arrNum).get(index);
            }
        }
        System.out.println(total);
        System.out.println(max);
        System.out.println(min);
        System.out.println(error);
    }

}
