class AllInOneDemo{
	void print (String s){
		System.out.println(s);
	}

	public static void main(String[] args){
		Student s1=new Student("Charlie");
		Student s2=new Student();
		Student s3=new Student("Don",65);
		
		System.out.println("Name of the student s1 is "+s1.name+" , Marks = "+s1.marks);
		System.out.println("Name of the student s2 is "+s2.name+" , Marks = "+s2.marks);
		System.out.println("Name of the student s3 is "+s3.name+" , Marks = "+s3.marks);
		
		Car c1=new Car();
		//Car c2=new Car();
		
		System.out.println("Model of the Car c1 is "+c1.name);
	}
}