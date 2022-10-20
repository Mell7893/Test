
public class CompoundForex {
	//STATE
private String name;
private String accountType;
private int accountNumber;
double balance;
private int id = 1001;




//CONSTRUCTOR
CompoundForex(double initDeposit){
	balance = initDeposit;	
}




//SET AND GET
public void setName(String typeName){
	name = typeName;
	
}


public String getName() {
	return name;
}


//ACTION




void percentage(double percent) {
	 System.out.println(balance * percent);
}







public void createAccountNumber(){
	int random = (int) (Math.random()*100);
	System.out.println("Account Number: " + id + "" + random);
}








void consisDeposit() {
	if(balance < 2000) {
		for(int i=0;i<10;i++) {
			deposit(1000);		
		}
	}
	
	else {
		System.out.println("Aite you good");
	}
}











 void deposit(double amount) {
	balance = balance + amount;
	System.out.println("NEW DEPOSIT:");
	showBalance();
}

 
 
 
 
 
 
 
 

 void withdraw(double amount){
	balance = balance - amount;
	showBalance();
}

 
 
 
 
 
 

public void showBalance(){
	System.out.println("$" + balance);
}








public void compoundMoney(double percentage){
	for(int i=0;i<10;i++) {
		balance = (balance * percentage) + balance;	
		showBalance();
	}
}


	}


