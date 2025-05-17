import java.util.*;

class FindSum{
	public static void main(String[] args){
	int sum=0;
	Scanner sc =new Scanner(System.in);
	
	for(int i=0; i<10; i++){
		System.out.println("Enter No "+(i+1));
		try{
			sum+=Integer.parseInt(sc.nextLine());
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
	System.out.println("----------------------------");
	System.out.println("Sum is: "+sum);
	System.out.println("----------------------------");
	}
	
}