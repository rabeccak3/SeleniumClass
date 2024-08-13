package qa_project_javapackage_3;


//Access Methods With An Object

	//Create a Class
	public class ObjectMethods_2 {
	//Create a fullThrottle() method
		public void fullThrottle() {
			System.out.println("The Car Goes Really Fast!!");
		}

		//Create a speed() method
		public void speed(int maxSpeed) {
			System.out.println("The speed is "+maxSpeed);
		}
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			ObjectMethods_2 myCar = new ObjectMethods_2(); //Create an object
			myCar.fullThrottle();   //Call fullThrottle() method
			myCar.speed(200);       //Call speed() method

	}

}
