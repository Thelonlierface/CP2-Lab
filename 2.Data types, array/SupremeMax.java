import java.util.ArrayList;
import java.util.Scanner;

public class SupremeMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        int max = 0;
        int abs_max = 0;
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        int index = 0;
        int ami = 0;
        ArrayList<Integer> row = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
            if(arr[i] == 0) {
                if(max != 0) System.out.print(max + " ");
                res.add(new ArrayList<>(row));
                if(max > abs_max) {
                    abs_max = max;
                    ami = index;
                }
                index++;
                max = 0;
                row.clear();
            }
            else {
                row.add(arr[i]);
            }
        }
        System.out.println();
        System.out.println(abs_max);
        for (int num : res.get(ami)) {
            System.out.print(num + " ");
        }
    }
}
