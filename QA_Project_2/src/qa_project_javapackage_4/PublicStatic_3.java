package qa_project_javapackage_4;

public class PublicStatic_3 {

	//Static Method
	static void myStaticMethod() {
		System.out.println("Static Methods Can Be Called Without Creating an Object");
		
	}
		
	//Public Method
	public void myPublicMethod() {
		System.out.println("Public Methods Must Be Called By Creating an Object");
		
	}
	
	//Main Method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    myStaticMethod();  //Call Static Method
    
    PublicStatic_3 myObj = new PublicStatic_3();
    myObj.myPublicMethod();  //Call Public Method
	}

}
