package qa_project_javapackage_2;

public class BankSystem_2 {

	int x = 5;
	
	void deposit()
	{
		System.out.println("Deposit the amount");
	}
	void withdraw()
	{
		System.out.println("Withdraw the amount ");
	}
	
	void display()
	{
		System.out.println("Display the amount");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankSystem_2 myObj = new BankSystem_2();
		System.out.println(myObj.x);
		myObj.deposit();
		myObj.withdraw();
		myObj.display();

		
		

	}

}
