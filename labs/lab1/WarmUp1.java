import java.util.Scanner;

public class WarmUp1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first integer: ");
		int num1 = input.nextInt();
		
		System.out.print("Enter the second integer: ");
		int num2 = input.nextInt();
		
		if (num1 > num2)
			System.out.println("The smallest value is " + num2);
		else
			System.out.println("The smallest value is " + num1);
			
		input.close();
	}
}
