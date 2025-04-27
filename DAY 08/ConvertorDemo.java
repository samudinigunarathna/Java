/*
Type conversion and Type Casting

boolean
short
char
long
int
float
double
String
*/

class ConvertorDemo{
	public static void main(String[] args){
		boolean bo = true;
		byte by=100;
		short sh =45;
		char ch='a';
		long lo=452;
		int in=456;
		float fl=65.2546f;
		double db=78.25486;
		String st="Hi";
		
		lo=by;
		sh=(short)lo;
		fl=in;
		
		in=(int)db;
		in=100;
		ch=(char)in;
		System.out.println("Values of boolean bo is : "+bo);
		System.out.println("Values of short sh is : "+sh);
		System.out.println("Values of char ch is : "+ch);
		System.out.println("Values of long lo is : "+lo);
		System.out.println("Values of int in is : "+in);
		System.out.println("Values of float fl is : "+fl);
		System.out.println("Values of double db is : "+db);
		System.out.println("Values of String st is : "+st);
	}
}