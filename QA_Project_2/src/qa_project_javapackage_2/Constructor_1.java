package qa_project_javapackage_2;

public class Constructor_1{
	int x; 	//Create a class attribute
	
	//Create a class constructor of the Constructor_1 class
	
	public Constructor_1() {
		x = 5; //Set the initial value for the class attribute x
	}
	


public static void main(String[] args) {
	Constructor_1 myObj = new Constructor_1(); //Create an object of class Constructor_1 (This will call the constructor)
     System.out.println(myObj.x); //Print the value of x
}

}