import IT.*;
import IT.Hons.*;
import AMC.*;

class App{
	public static void main(String[]args){
		AMC.FirstYear fya=new AMC.FirstYear();
		IT.FirstYear fyi=new IT.FirstYear();
		SecondYear sy=new SecondYear();
		FourthYear ITHons=new FourthYear();
		
		fya.display();
		fyi.display();
		sy.display();
		ITHons.display();
	}
}