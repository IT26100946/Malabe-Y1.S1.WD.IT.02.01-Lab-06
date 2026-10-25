import java.util.Scanner;
public class IT26100946Lab6Q1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		double no =sc.nextDouble();
		double sqr = no *no;
		double sqroot = Math.sqrt(no);
		System.out.println();
        System.out.println("The square of "+no +" is : "+sqr);
        System.out.println("The square root of "+no+ " is : "+sqroot);
		sc.close();
		
	}
}