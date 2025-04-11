import java.util.ArrayList;
import java.util.Scanner;
//note : this code only works for FoodContents 2

class Food {
	String name;
	ArrayList<String> content;
	ArrayList<Integer> weightOfContent;
	ArrayList<Integer> caloriesPerGram;
	int totalWeight;
	int totalCalPerGram;

	public Food(String foodName, String foodContent, int contentWeight, int cpg) {
		name = foodName;
		content = new ArrayList<>();
		weightOfContent = new ArrayList<>();
		caloriesPerGram = new ArrayList<>();
		content.add(foodContent);
		weightOfContent.add(contentWeight);
		totalWeight += contentWeight;
		caloriesPerGram.add(cpg);
		totalCalPerGram += cpg*contentWeight;
	}

	void addContent(String foodContent, int contentWeight, int cpg) {
		content.add(foodContent);
		weightOfContent.add(contentWeight);
		totalWeight += contentWeight;
		totalCalPerGram += cpg*contentWeight;
	}

	void printInfo() {
		System.out.println(name);
		System.out.println(totalWeight + " " + totalCalPerGram);
		for (String cont : content) {
			System.out.print(cont + " ");
		}
		System.out.println();
	}
}

public class FoodContents {

    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	String foodName = scan.next();
    	String content1 = scan.next();
    	int w1 = scan.nextInt();
		int cpg1 = scan.nextInt();
    
		Food food = new Food(foodName, content1, w1, cpg1);
    	
    	int q = scan.nextInt();
		    
	    while(q != 0) {
    	    
	        if(q == 1) {
        		food.printInfo();
	        } 
    	    else if(q == 2) {
    		    String content = scan.next();
				int weight = scan.nextInt();
				int cpg = scan.nextInt();
				food.addContent(content, weight, cpg);
    	    }
    	    q = scan.nextInt();
	    }
		scan.close();
	}
}