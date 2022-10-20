
public class MyMoney {
double hours;
int wage;
int taxes;

MyMoney(int wage,int taxes){
	this.wage = wage;
	this.taxes = taxes;
}


void calculateMyPay(double hours){
	double pay = (wage * hours) - taxes;
	System.out.println(pay);
	}



}
