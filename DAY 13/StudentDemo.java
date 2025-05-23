import java.util.*;

class Student{
	String name;
	int age;
	Student(String name, int age){
		this.name=name;
		this.age=age;
	}
}

class StudentDemo{
	public static void main(String[] args){
	ArrayList<Student> stds=new ArrayList<>();
	Student s1=new Student("Mukilan",24);
	Student s2=new Student("Kokul",22);
	Student s3=new Student("Suleka",22);
	
	stds.add(s1);
	stds.add(s2);
	stds.add(s3);
	stds.add(new Student("Dilshan",22));
	
	for(Student s: stds){
		System.out.println("Name: "+s.name+" age: "+s.age);
	}
	}
}