package qa_project_javapackage_3;

public class PublicStatic_2 {
	
	//Static Method
	static void myStaticMethod(){
		System.out.println("Static Methods Can Be Called Without Creating Objects");
	}
	
	//Public Method
	public void myPublicMethod() {
		System.out.println("Public Methods Must Be Called By Creating Objects");
	}
	
	
	//Main Method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myStaticMethod();  //Call the Static Method
		
		PublicStatic_2 myObj = new PublicStatic_2(); //Create an object of PublicStatic_2
		myObj.myPublicMethod();  //Call the Public Method
	}

}
