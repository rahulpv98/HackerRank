import java.util.*;
public class SolutionDay1 {

	public static void main(String[] args) {
        int i=4;
        double d=4.0;
        String s="HackerRank ";
        Scanner scan=new Scanner(System.in);
        int num1=scan.nextInt();
        double num2=scan.nextDouble();
        String str;
        str=scan.nextLine();
        str=scan.nextLine();
        int sum=num1+i;
        double sum1=num2 + d;
        System.out.println(sum);
        System.out.println( String.format( "%.1f", sum1 )); 
        System.out.println(""+s+str);

}
}