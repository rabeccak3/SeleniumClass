package qa_project_javapackage_4;

	//Access Methods Within An Object

	//Create A Class
	public class ObjectMethods_3 {
	//Create A fullThrottle() method
		public void fullThrottle() {
			System.out.println("This car goes fast!");
		}
	//Create a speed() method
		public void speed(int maxSpeed) {
			System.out.println("The speed is "+maxSpeed);
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ObjectMethods_3 myCar = new ObjectMethods_3(); //Create an Object
	myCar.fullThrottle(); //Call fullThrottle() method
	myCar.speed(200); //Call speed() method
	
	}

}
