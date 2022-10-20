package exceptionfile;

import java.util.Scanner;

public class PaymentApp {

	public static void main(String[] args) {
		double payment = 0;
		//1. Ask user for input
		System.out.print("Enter payment amount: ");
		//2. Get amount and test value
		Scanner input = new Scanner(System.in);
		int amount = input.nextInt();
		System.out.println(amount);
		payment = input.nextDouble();
		//3. Handle exceptions
		//4. Print
	}

}
