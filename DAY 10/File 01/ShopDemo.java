import java.util.Scanner;
class ShopDemo{
	
	static String description[]={"Bread  \t","Milk Powder","Tooth Paste"};
	static int unitPrice[]={160,1060,260};
	static Scanner sc=new Scanner(System.in);
	
	static byte[] itemBasketIndex=new byte[3];
	static int[] itemBasketQuantity=new int[3];
	static int basketIndex=0;
	
	static void getItems(){
		System.out.println("Welcome to the Demo Shop");
		System.out.println("Please select your Item by entering the relevent number ");
		char userOption='y';
		
	do{
			
		for(int i=0; i<description.length; i++){
			System.out.println("Enter "+i+" for "+description[i]);
		}
		
		int itemIndex=sc.nextInt();
		
		System.out.println("You have chosen "+description[itemIndex]);
		System.out.println("Unit Price of "+description[itemIndex]);
		System.out.println(unitPrice[itemIndex]);
		System.out.println("Enter the Quantity ");
		int numberOfUnits=sc.nextInt();
		
		itemBasketIndex[basketIndex]=(byte)itemIndex;
		itemBasketQuantity[basketIndex]=numberOfUnits;
		basketIndex++;
		
		System.out.println("Enter y to continue, press any character to exit");
		
		Scanner sc1=new Scanner(System.in);
		userOption=sc1.nextLine().charAt(0);//(char)sc.nextLine();
	}
	while(userOption=='y'&& basketIndex<3);
	
	}
	static void showBasket(){
		int total=0;
		
		System.out.println("+-------------------------------------------------------------------------------+");
		System.out.println("| No \t | Item \t \t| Unit Price \t| Quantity \t |Price \t|");
		System.out.println("+-------------------------------------------------------------------------------+");
		for(int i=0; i<basketIndex; i++){
			System.out.println("|"+i+" \t | "+description[itemBasketIndex[i]]+"  \t| "+unitPrice[itemBasketIndex[i]]+"\t \t| "+itemBasketQuantity[itemBasketIndex[i]]+"\t \t | "+unitPrice[itemBasketIndex[i]]*itemBasketQuantity[itemBasketIndex[i]]+"\t\t|");
			total = unitPrice[itemBasketIndex[i]]*itemBasketQuantity[itemBasketIndex[i]]+total;
		}
		System.out.println("+-------------------------------------------------------------------------------+");
		System.out.println("Your total price is Rs "+total+"/=");
	}
	
	public static void main(String[] args){
		getItems();
		showBasket();
	}
	
	
}