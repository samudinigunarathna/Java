import java.util.*;

class Student{
	private String name;
	private int exam1;
	private int exam2;
	private int exam3;
	
	void Setter(String name, int exam1, int exam2, int exam3){
		this.name=name;
		this.exam1=exam1;
		this.exam2=exam2;
		this.exam3=exam3;
		
	}
}	

class Main{
	public static void main(String[] args){
		
		String name;
		int exam1;
		int exam2;
		int exam3;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please Enter your name ");
		Student st=new Student();
		name=sc.nextLine();
		System.out.println("Your exam scores ");
			try{
				
				exam1=Integer.parseInt(sc.nextLine());
				if( 0<exam1 && exam1<100 ){
					System.out.println("Enter your score in Exam 01: "+exam1);
				}
				else{
					System.out.println("Exam scores must be between 0 and 100.");
				}
				exam2=Integer.parseInt(sc.nextLine());
				if( 0<exam2 && exam2<100 ){
				System.out.println("Enter your score in Exam 02: "+exam2);
				}
				else{
					System.out.println("Exam scores must be between 0 and 100.");
				}
				exam3=Integer.parseInt(sc.nextLine());
				if( 0<exam3 && exam3<100 ){
				System.out.println("Enter your score in Exam 03: "+exam3);
				}
				else{
					System.out.println("Exam scores must be between 0 and 100.");
				}
				
				st.Setter(name,exam1,exam2,exam3);
			}
			
			catch(Exception e){
				System.out.println("Error");
				System.out.println("The Error is "+e.getMessage());
			}
		}
}