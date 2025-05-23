import java.util.*;

class Arr{
	public static void main(String[] args){
		
		//Creating an empty ArrayList
		ArrayList<Integer> a1 = new ArrayList<>();
		
		//use add() method to add element
		a1.add(10);
		a1.add(20);
		a1.add(30);
		
		//Adding new element at index 2
		a1.add(2,22);
		
		System.out.println("" + a1);
		
		//Remove element 20
		a1.remove(1);
		
		System.out.println("" + a1);
		
		//Remove element 10 by using object 
		a1.remove(Integer.valueOf(10));
		
		System.out.println("" + a1);
		
		//Remove the elements less than 10
		
		//Creating Itarator Object
		Iteraror itr = a1.iterator();
		
		while(itr.hasNext()){
			int x = (Integer)itr.next();
			System.out.println("" + x);
			if(x<10)
				itr.remove();
		}
		
		System.out.println("Printing the elements using enhanced for loop");
			for(Integer e:a1){
				System.out.println(e + "->");
			}
	}
}