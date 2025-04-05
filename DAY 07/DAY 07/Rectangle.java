class Rectangle{
	void print(int width,int height){
		for(int i=1; i<=height; i++){
			for(int j=1; j<=width; j++){
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}

class Main{
	public static void main(String[] args){
		//for(int i=1; i<=10; i++){
			//System.out.println("Value of i is "+i);
		
		Rectangle r1=new Rectangle();
		r1.print(3,4);
	}
}