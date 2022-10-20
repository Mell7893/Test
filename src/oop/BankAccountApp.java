package oop;

//YOUR OBJECTS
public class BankAccountApp{

	public static void main(String[] args) {
		//NEW BANK ACCOUNT 		
		BankAccount acc1 = new BankAccount();
		
		acc1.accountType = "Checking Account";
		acc1.accountNumber = "000384372";
		acc1.balance =  60_000;
		acc1.deposit(1000);
		acc1.withdrawl(500);
		acc1.setName("Iyanna");
		System.out.println(acc1.getName());
		System.out.println(acc1.toString());
		
		
				
		
		
		
		
		
		BankAccount acc2 = new BankAccount("Checking Account", "Jemell");
		acc2.setName("Jemell");
		acc2.setSSN("152-94-4929");
		System.out.println(acc2.getName());
		System.out.println(acc2.getSSN());

		
		
		

		BankAccount acc3 = new BankAccount("Savings Account", 5600);
		acc3.checkBalance();
		
		
		
		
		
		CDAccount cd1 = new CDAccount(777654);
		cd1.compoundInterest();
		cd1.setRate("Jemell");
		cd1.increaseRate();
	
		
	}

}
