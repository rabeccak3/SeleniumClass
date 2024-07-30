package qa_project_javapackage;

public class InheritancClass implements RegistrationForm{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	University obj=new University();
	//	obj.nameUniversity();
	//	obj.course();
		
		College obj1=new College();
		obj1.collegeName();
		obj1.registerationform();
		obj1.nameUniversity();
		obj1.course();
	}

	@Override
	public void studentName() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void emailAdd() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void courseNmae() {
		// TODO Auto-generated method stub
		
	}

}



class  University
{
		void nameUniversity()
		{
			System.out.println("The name of university is Stanford");
		}
		
		void course()
		{
			System.out.println("The name of course is Computer Science");
		}
}

class	College extends University
{
	void collegeName()
	{
		System.out.println("the name of collegee is seven schools");
	}
	
	void registerationform()
	{
		System.out.println("The form for enrollment");
	}
}
