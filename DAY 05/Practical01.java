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
		d.name="My First Document";
		System.out.println("Name of the Document d is "+d.name);
		
		Document d2=new Document();
		System.out.println("Created a Document Object d2");
		d2.name="My Second Document";
		System.out.println("Name of the Document d is "+d2.name);
		
		d.p=new Paper();
		d.p.text="This is the text in the paper of document My first document";
		d.p.length=5;
		d.p.width=3;
		System.out.println("Size (l*w) of the document d is "+d.p.length+"*"+d.p.width);
		System.out.println("The text value of the paper of the Document d is "+d.p.text);
	}
}