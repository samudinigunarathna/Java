class Student{
	int marks=25;
	String name="Samudi";
	
	Student(){
		name="NoName";
	}
	
	Student(String n){
		name="n";
	}
	
	Student(String n, int m){
		name=n;
		marks=m;
	}
}

class StudentDemo{
	public static void main(String[] args){
		System.out.println("Hi from StudentDemo class");
		
		Student S1=new Student("Nice Name",85);
		System.out.println("Created an object of Student of Student Class");
		System.out.println("Name value of the object is "+S1.name);
		System.out.println("Marks value of the object is "+S1.marks);
		
		S1.name="Ama";
		S1.marks=56;
		
		System.out.println("Name value of the object is "+S1.name);
		System.out.println("Marks value of the object is "+S1.marks);
	}
}