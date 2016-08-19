package constructors;

public class SmallBox {
	
	int length;
	int width;
	
	
// constructor is a method that has same name as class//
	// It is executed when an object is created//
	//It is used to set default values//
	//Doest not return anything including void//
	
	SmallBox(){
		length=5;
		width=9;
		System.out.println("constructor fired");
	}
	// these length and width are passing arguments//
		SmallBox(int length,int width)
		{
		this.length=length;
		this.width=width;
		
		}
	
	void area(){
		int area= length*width;
		System.out.println(area);
		
	}
	
		
	

}
