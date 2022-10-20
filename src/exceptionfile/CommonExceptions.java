package exceptionfile;

public class CommonExceptions {

	public static void main(String[] args) {
		int a = 5;
		int b = 0;
		
		//FIND THE PROBLEM
		//USE TRY-CATCH
		//ERROR GOES INTO "TRY"
		//COPY & PASTE EXPECTION TO "CATCH" WITH A VARIABLE
		try {
			int c = a/b;
		} catch(ArithmeticException error) { 
			System.out.println("CANNOT DIVIDE BY ZERO");
			System.out.println(error.toString());
		}
		System.out.println("Program is closing");
		
		String[] states = {"NJ", "NY", "NC", "FL"};
		
		for(int i = 0; i<=states.length; i++) {
			try {
				System.out.println(states[i]);
			} catch(ArrayIndexOutOfBoundsException error) {
				System.out.println("IDK what to print here.");
				System.out.println(error.toString());
			}
		}
	}

}
