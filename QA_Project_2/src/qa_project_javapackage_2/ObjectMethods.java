package qa_project_javapackage_2;

//Access Methods With An Object

//Create a Class
public class ObjectMethods {
	
	//Create a fullThrottle() method
	public void fullThrottle() {
		System.out.println("This Car is Going as Fast As It Can!");
	}

	//Create a speed() method and add a parameter
	public void speed (int maxSpeed) {
		System.out.println("Max speed is  "+maxSpeed);
	}
	
	//Inside ObjectMethods class, call methods on the myCar object
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectMethods myCar = new ObjectMethods();	//Create a myCar object
		myCar.fullThrottle();   //Call the fullThrottle() method
		myCar.speed(200);   //Call the speed() method
		
	}

}
