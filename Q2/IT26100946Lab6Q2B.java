import java.util.Scanner;
public class IT26100946Lab6Q2B{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int count = 1;
		int no =1;
		String numbers ="";
		while (count<= 10){
			System.out.print("Enter number "+no+":");
			int number =sc.nextInt();
			count += 1;
			no += 1;
			numbers += number+" ";
			
		}
		System.out.println("\nThe numbers you entered are:");
        System.out.println(numbers);
		sc.close();
	}
}