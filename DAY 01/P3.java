class one{
	int a=10;
	int b;
	
	void printDetails(){
		System.out.println("From class one a= "+a);
		System.out.println("From class one b= "+b);
	}
}

class two{
	int	a,c;
	
	void printDetails(){
		System.out.println("From class two a= "+a);
		System.out.println("From class two c= "+c);
	}

}

class App{
	
	public static void main (String[] args){
		one o1=new one();
		two t1=new two();
		
		o1.printDetails();
		o1.b=100;
		o1.printDetails();
		t1.printDetails();
		t1.a=20;
		t1.c=30;
		t1.printDetails();
	}
}