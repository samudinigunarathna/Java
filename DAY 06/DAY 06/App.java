class Student{
		int marks;
		String name;
		
	Student(){
		System.out.println("Creating a Student Object");
		name="Default name";
	}

	Student(String n, int m){
		System.out.println("Creating a Student Object with name "+n+" and marks "+m);
	}
}

class Printer{
	void print(String s){
		System.out.println(s);
	}
}

class App{
	public static void main(String[] args){
		Printer p=new Printer();
		p.print("Created new Object");
		
		System.out.println("Welcome to Demo Class App");
		
		Student s1=new Student("Miky",100);
		//s1.marks=100;
		//s1.name="Miky";
		
		//p.print("Student's name is "+s1.name+" Student's marks is "+s1.marks);
		
		Student s2=new Student("Rebecca",56);
		//s2.marks=56;
		//s2.name="Rebecca";
		
		//p.print("Student's name is "+s2.name+" Student's marks is "+s2.marks);
	}
}