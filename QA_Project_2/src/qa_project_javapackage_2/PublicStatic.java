package qa_project_javapackage_2;

public class PublicStatic {

		  // Static method
		  static void myStaticMethod() {
		    System.out.println("Static methods can be called without creating objects");
		  }

		  // Public method
		  public void myPublicMethod() {
		    System.out.println("Public methods must be called by creating objects");
		  }

		  // Main method
		  public static void main(String[] args) {
		    myStaticMethod(); // Call the static method

		    PublicStatic myObj = new PublicStatic(); // Create an object of MyClass
		    myObj.myPublicMethod(); // Call the public method
		  }
		

	}


