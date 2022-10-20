package basics;

public class CalculateHours {

	public static void main(String[] args) {
		double city = 33.13;
		double dock = 4.12;
		double additional = 7.9;
		double beforeTax = ((city + dock + additional) * 22.5);
		double afterTax = ((city + dock + additional) * 22.5) - 119.31;
		System.out.println("BEFORE TAX: $" + beforeTax);
		System.out.println("AFTER TAX: $" + afterTax);

		
	}

}
