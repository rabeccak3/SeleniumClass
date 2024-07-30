package qa_project_javapackage;

public class BankSystem {
	
	BankSystem(String username,String password)
	{
		System.out.println("The username and the password "+username+ " "+password);
	}
	
	int amt=1000;
	
	void deposit(int dep)
	{
		amt=amt+dep;
		System.out.println("The amounnt after the deposit "+amt);
	}
	void withdraw(int wt)
	{
		amt=amt-wt;
		System.out.println("The amount after the withdraw "+amt);
	}
	
	int display()
	{
		return amt;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create an object 
		BankSystem obj= new BankSystem("ravecca1234","123456");
		obj.deposit(2000);
		obj.withdraw(500);
		System.out.println(obj.display());
		
	}

}
