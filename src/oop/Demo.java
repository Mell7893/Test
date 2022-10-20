package oop;

//BLUEPRINT FOR OBJECTS (CLASS)
class Person {
	String name;
	String email;
	String phoneNumber;
	String job;
	int age;
	
	 void walkToWork() {
		walk();
	}
	 
	void walk(){
		System.out.println(name + " is walking");
	}
	
	void eat(){
		System.out.println(name + " is eating");
	}
	
	void sleep(){
		System.out.println(name + " is sleeping");
	}
	
	
	
}

public class Demo {

	public static void main(String[] args) {
		
		//CREATE OBJECT
		//DECLARE OBJECT VARIABLE
		Person personOne = new Person();
		personOne.name = "Jemell";
		personOne.email = "jemellfoster@yahoo.com";
		personOne.age = 28;
		personOne.phoneNumber = "(919) 491-2685";
		personOne.job = "Central Transport";
		
		
		personOne.walkToWork();
	}
		
		/*//PERSON, DESCRIBE
		//VARIABLES
		String name = "Jemell";
		String email = "jemell_foster@yahoo.com";
		String phoneNumber = "9194912685";
		
		//ACTION
		driving(name);
		coding(name);		
		
		//DO THIS FOR 2ND PERSON
		String name2 = "Iyanna";
		String email2 = "thasnotsafeyahyah@yahoo.com";
		String phoneNumber2 = "9196987727";
		
		driving(name2);
		coding(name2);		
	}
	
	
	//CREATE METHODS/FUNCTION TO MINIMIZE CODE
	//DRIVING FUNCTION
	static void driving(String name){
		System.out.println(name + " is driving");
	}
	
	
	//CODING FUNCTION
	static void coding(String name) {
		System.out.println(name + " is coding");
	}*/

}
