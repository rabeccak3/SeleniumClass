package qa_project_javapackage_2;

//Create a class
public class ConstructorWithParameters {
	
//Create a class attribute
	
	int x;
	
	//Create a constructor, then add a parameter to the constructor in parentheses
	public ConstructorWithParameters(int y) {  
		
		x = y;
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Create an object
		ConstructorWithParameters myObj = new ConstructorWithParameters(5);
		System.out.println(myObj.x);
		
	}
	}
