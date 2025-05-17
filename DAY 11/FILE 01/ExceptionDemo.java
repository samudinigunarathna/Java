class ExceptionDemo{
	public static void main(String[] args){
		System.out.println("Start of the programme");
		int a=10;
		int b=1;
		try{
		int c=a/b;
		int d=Integer.parseInt(args[0]);
		}
		catch(Exception e){
		System.out.println("An Error Occured!");
		System.out.println("The Error is "+e.getMessage());
		}
		System.out.println("End of the programme");
	}
}