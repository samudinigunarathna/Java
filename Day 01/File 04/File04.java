class One{
	
	int a = 10;
	int b;
	
	void printDetails(){	//	The method
		System.out.println("From Class one a = " + a);
		System.out.println("From Class one b = " + b);
	}
	
}

class Two{
	
	int a;
	int c;
	
	void printDetails(){	//	The method
		System.out.println("From Class one a = " + a);
		System.out.println("From Class one c = " + c);
	}
	
}

class App{
	
	public static void main(String[] args){
		One object1 = new One();
		Two object2 = new Two();
		
		object1.printDetails();
		object2.printDetails();
		System.out.println("");
		object2.a = 20;
		object2.c = 30;
		object2.printDetails();
	}
	
}