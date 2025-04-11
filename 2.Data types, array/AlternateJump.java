import java.util.Scanner;

public class AlternateJump {
    private int jump(int[] arr1, int[] arr2, int status, int index1, int index2, int count1, int count2) {
        if (status == 1) {
            System.out.println(1 + " " + (index1 + 1) + " " + arr1[index1]);
            if (arr1[index1] % 2 == 0) {
                if (index1 + arr1[index1] >= arr1.length) {
                    System.out.println(count1);
                    System.out.println(count2);
                    return count1;
                }
                else return jump(arr1, arr2, 1, index1 + arr1[index1], index2, count1 + 1, count2);
            } 
            else {
                if (index2 + arr1[index1] >= arr1.length) {
                    System.out.println(count1);
                    System.out.println(count2);
                    return count1;
                }
                else return jump(arr1, arr2, 2, index1, index2 + arr1[index1], count1, count2 + 1);
            }
        } 
        else {
            System.out.println(2 + " " + (index2 + 1) + " " + arr2[index2]);
            if (arr2[index2] % 2 == 0) {
                if (index2 + arr2[index2] >= arr2.length) {
                    System.out.println(count1);
                    System.out.println(count2);
                    return count1;
                }
                else return jump(arr1, arr2, 2, index1, index2 + arr2[index2], count1, count2 + 1);
            } 
            else {
                if (index1 + arr2[index2] >= arr2.length) {
                    System.out.println(count1);
                    System.out.println(count2);
                    return count1;
                }
                else return jump(arr1, arr2, 1, index1 + arr2[index2], index2, count1 + 1, count2);
            }
        }
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int n = input.nextInt();
            AlternateJump aj = new AlternateJump();
            int arr1[] = new int[n];
            int arr2[] = new int[n];
            for (int i = 0; i < arr2.length; i++) {
                arr1[i] = input.nextInt();
            }
            for (int i = 0; i < arr2.length; i++) {
                arr2[i] = input.nextInt();
            }
            // call func
            aj.jump(arr1, arr2, 1, 0, 0, 1, 0);
        }
    }
}
