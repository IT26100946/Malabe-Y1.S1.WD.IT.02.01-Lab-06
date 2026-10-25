import java.util.Scanner;
public class IT26100946Lab6Q2C{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int count = 1;
		int no =1;
		double sum=0;
		String numbers ="";
		while (count<= 10){
			System.out.print("Enter number "+no+":");
			int number =sc.nextInt();
			count += 1;
			no += 1;
			numbers += number+" ";
			sum +=number;
			
		}
		System.out.println("The numbers you entered are:");
        System.out.println(numbers);
		System.out.print("\n");
		System.out.println("Sum of numbers:"+sum);
		System.out.print("\n");
		System.out.println("Average of numbers:"+(sum/10));
		sc.close();
	}
}