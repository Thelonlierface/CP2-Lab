import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class UnintendedCondoSale {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int p = input.nextInt();
        int k = input.nextInt();
        ArrayList<Integer> aptSold = new ArrayList<Integer>();
        for (int i = 0; i<k; ++i) {
            int order = input.nextInt();
            if(order >= p || order <= n) {
                aptSold.add(order);
            }
        }
        input.close();
        Collections.sort(aptSold);
        List<Integer> apts = aptSold.stream().distinct().collect(Collectors.toList());
        System.out.println(apts.size());
        for (int apt : apts) {
            System.out.println(apt);
        }
    }
}

//apparently they want us to find how many errors are there in the order sequence not the other way around (as the document stated)
