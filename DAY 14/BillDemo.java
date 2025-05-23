import java.util.*;
class Product{
	private String name;
	private int unitPrice;
	
	Product(String name, int price){
		this.name=name;
		this.unitPrice=price;
	}
	
	public String getName(){
		return name;
	}
	
	public int getUnitPrice(){
		return unitPrice;
	}
	
	public void setUnitPrice(int newPrice){
		unitPrice=newPrice;
	}
	
	public void printProductDetails(){
		System.out.println("Name: "+name+" Unit Price: "+unitPrice);
	}
}

class BillEntry{
	Product p;
	int quantity; //Number of units
	
	BillEntry(Product p, int qty){
		this.p=p;
		this.quantity=qty;
	}

	int getTotal(){
		return p.getPrice()*quantity;
	}
	
	void printBillEntry(){
		System.out.println("Product name: "+p.getName()+" Unit Price: "+p.getUnitPrice()+" Number of Units: "+quantity+" Total Price: "+p.getUnitPrice()*quantity);
	}
}

class Bill{
	ArrayList<BillEntry>billEntries=new ArrayList<>();
	int grandTotal=0;
	
	void addEntry(BillEntry be){
		billEntries.add(be);
		grandTotal+=entry.getTotal();
	}

	void getEntries(){
		for(BillEntry entry: billEntries){
			System.out.println(entry.p.getName()+" X "+entry.quantity+" = "+entry.getTotal());
		}
	}
	
	void printBill(){
		for(BillEntry e: billEntries){
		System.out.println("Product name "+e.p.getName()+" X "+e.quantity+" = "+e.p.getUnitPrice()*e.quantity);
		
		}
	}
}

class BillDemo{
	
	static void print(String s){
		System.out.println(s);
	} 
	
	static void printProductDetails(Product p){
		print("Name: "+p.getName()+" Unit Price: "+p.getUnitPrice());
	}
	
	public static void main(String[] args){
		print("Welcome to Demo shop");
		print("Entering Products");
		Product milk=new Product("Diamond",140);
		print("Successfully added");
		milk.printProductDetails();
		printProductDetails(milk);
		Product bread=new Product("Prima",160);
		print("Successfully added");
		printProductDetails(bread);
		Product tea=new Product("Zesta",230);
		print("Successfully added");
		printProductDetails(tea);
		bread.setUnitPrice(165);
		print("Successfully changed unitPrice");
		printProductDetails(bread);
		
		print("Entering new Bill Entry");
		BillEntry be1=new BillEntry(milk,10);
		be1.printBillEntry();
		
		Bill b=new Bill();
		b.addEntry(be1);
		b.addEntry(new BillEntry(bread,5));
		b.addEntry(new BillEntry(new Product("Sugar",250),3));
		b.printBill();
	}
}
