import java.util.Scanner;
public class IT26100946Lab6Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = 0;
        double sumofsqr = 0;
        System.out.println("Enter positive integer (terminate  with -99):");
        while (true) {
            System.out.print("Enter a number: ");
            int number = input.nextInt();
            if (number == -99) {
                break;
            }
            if (number < 0) {
                System.out.println("Invalid input please enter a positive integer or -99 to terminate");
            } else {
                sumofsqr += Math.pow(number, 2);
                count++;
            }
        }
        double rms = 0;
        if (count > 0) {
            rms = Math.sqrt(sumofsqr / count);
        }
        System.out.println();
        System.out.println("The Root Mean Square  is: " + rms);
        input.close();
    }
}