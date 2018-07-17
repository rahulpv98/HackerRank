import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		//System.out.println("Enter meal cost ");
		float mealCost=scn.nextFloat();
		//System.out.println("Enter tip percent ");
		int tipPercent=scn.nextInt();
		//System.out.println("Enter tax percent ");
		int taxPercent=scn.nextInt();
		float totalCost=mealCost+((tipPercent*mealCost)/100)+((taxPercent*mealCost)/100);
		int total=Math.round(totalCost);
		System.out.println("The total meal cost is "+total+" dollars.");
	}

}
