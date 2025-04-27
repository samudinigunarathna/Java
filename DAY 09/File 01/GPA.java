import java.util.*;

class GPA{

	float gradePoint(String grade){
		float gp=0;//grade point value
		
		/*if(grade=="A+" || grade=="A")
		{
			gp=4;
		}
		else if(grade=="A-")
		{
			gp=3.7f;
		}*/
		
		
		
		switch(grade){
			case "A+":
			gp=4;
			break;
			case "A":
			gp=4;
			break;
			case "A-":
			gp=3.7f;
			break;
			case "B+":
			gp=3.3f;
			break;
			case "B":
			gp=3;
			break;
			case "B-":
			gp=2.7f;
			break;
			case "C+":
			gp=2.3f;
			break;
			case "C":
			gp=2;
			break;
			case "C-":
			gp=1.7f;
			break;
			case "D+":
			gp=1.3f;
			break;
			case "D":
			gp=1;
			break;
			
			default:
			gp=0;
			break;
		}
			
			return gp;
	}
	
}

class Demo{
	
		static Scanner sc=new Scanner(System.in);
		static GPA g=new GPA();
		static String subject[]={"IT1113","IT1152","IT1134","IT1144","IT1122"};
		static int credits[]={3,2,4,4,2};
		
		static String[] grades=new String[5];
		static float[] gps=new float[5];
		
	static float getPoint(String subjectCode, int credit){
		System.out.print("Enter the Grade for "+subjectCode+": ");
		String grade=sc.nextLine();
		System.out.println("Grade point value of the grade "+grade+" is "+g.gradePoint(grade));
		System.out.println("Grade Point * credit is "+g.gradePoint(grade)*credit);
		return g.gradePoint(grade)*credit;
	}
	
	static float getPoint(int index){
		System.out.print("Enter the grade for "+subject[index]+" : ");
		grades[index]=sc.nextLine();
		gps[index]=
		System.out.println("Grade point value of the grade "+grades[index]+" is "+g.gradePoint(grades[index]));
		System.out.println("Grade point * credit is "+g.gradePoint(grades[index])*credits[index]);
		return g.gradePoint(grades[index])*credits;
	}
		
	public static void main(String[] args){
		String name;
		float ogp=0;
		
		System.out.println("Enter your Name: ");
		name=sc.nextLine();
		System.out.println("Hi "+name);
		
		for(int i=0;i<5;i++){
			ogp+=getPoint(subject[i],credits[i]);
		}
		
		/*ogp+=getPoint("IT1113",3);
		ogp+=getPoint("IT1144",3);
		ogp+=getPoint("IT1134",3);
		ogp+=getPoint("IT1122",3);
		ogp+=getPoint("IT1152",3);*/
		
		System.out.println("Final GPA is for current semester is "+ogp/15);
		
		for(int i=0; i<5;i++){
			System.out.println("Subject "+subject[i]+" credit "+credits[i]+" grade "+grades[i]+" gradepoint "+gps[i]);
		}
	}
}