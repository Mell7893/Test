package oop;

//THE BLUEPRINT FOR OBJECTS
//NO MAIN METHOD
public class BankAccount implements IRate{
	
	
	
	
	//INSTANCE VARIABLES
	//GLOBAL VARIABLES
	//THE STATE
	//WHAT ALL BANK ACCOUNTS WILL HAVE
	String accountNumber;
	String accountType;
	double balance = 610;
	
	//FINAL: cannot change value
	//STATIC: belongs to class
	//PRIVATE: called ONLY WITHIN CLASS
	private String name;
	private String ssn;
	private final static String routingNumber = "00000775574";

	
	

	
	
	
	
	
	
	//CONSTRUCTORS
	//UNIQUE METHODS
	//SAME NAME AS CLASS
	//NO RETURN TYPE
	
	//ACC1
	BankAccount() {
		System.out.println("NEW ACCOUNT!");
	}
	
	
	
	
	
	
	
	
	
	
	//OVERLOADING: passing ALOT of ARGUMENTS(variables)
	
	//ACC2
	BankAccount(String accountType,String name){
		System.out.println(name + "'s " + accountType);
	}
	
	
	
	
	
	
	
	
	
	
	//ACC3
	//LOCAL VARIABLES: declare variables within method
	BankAccount(String accountType, double yourDeposit){
		System.out.println("New " + accountType + " created!");
		System.out.println("You've deposited " + yourDeposit + " in your " + accountType);
		balance = balance + yourDeposit;
		
		
		//NULL (IF YOU PRINT OUTSIDE OF DECLARATION)
		//REMOVE DATA TYPE
		String Msg = null;
		
		if(yourDeposit < 1000) {
			 Msg = "Sorry! You must deposit more.";
		}
		
		else {
			 Msg = "Thank you for your deposit";

		}
		System.out.println(Msg);
	}
	
	
	
	
	//SET & GET
	public void setName(String typeName){
		name = typeName;
	}
	
	public String getName(){
		return name;
	}
	
	
	
	public void setSSN(String ssn){
		this.ssn = ssn;
	}
	
	public String getSSN(){
		return ssn;
	}
	
	
	
	
	
	//INTERFACE METHODS

	
	
	
	
	
	
	//BANK ACCOUNT ACTIONS
	//METHODS OR FUNCTIONS
	
	
	void checkBalance() {
		System.out.println("BALANCE: " + balance);
	}
	
	
	
	
	
	
	void getStatus() {
		
	}
	


	
	void deposit(double amount) {
		 balance = balance + amount;
		 showActivity("DEPOSIT");
	}
	
	
	
	
	
	void withdrawl(double amount) {
		balance = balance - amount;
		 showActivity("WITHDRAW");

	}
		
	
	
	
	
	private void showActivity(String activity){
		System.out.println("Showing recent activity: " + activity);
		System.out.println("YOUR NEW BALANCE IS $" + balance);
	}
	
	
	
	
	
	@Override 
	public String toString(){
		return "[" + name + " " + accountType + " " + "AN:" + accountNumber + " RN:" + routingNumber + " BALANCE: " + balance + "]";
				
	}




	public void setRate(String name) {
		this.name = name;
		System.out.println(name + ", your rate is set!");
	}
	public void increaseRate() {
		System.out.println("Increasing Rate!");
	}










	@Override
	public void setRate() {
		// TODO Auto-generated method stub
		
	}





	
	

}
