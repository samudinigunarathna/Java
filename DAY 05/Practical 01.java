class Paper{
	int length;
	int width;
	String text;
	
}

class Document{
	String name;
	Paper p;
	
	public static void main(String[] args){
		Document d=new Document();
		System.out.println("Created a Document Object d");
}