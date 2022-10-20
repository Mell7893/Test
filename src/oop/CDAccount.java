package oop;

public class CDAccount extends BankAccount{
	
	int interestRates;
	
	//CONSTRUCTOR
	CDAccount(int interestRates){
		System.out.println(interestRates);	
	}
	
	
	
	
	//METHOD
	void compoundInterest () {
		System.out.println("Compounding Interest");
	}

}
