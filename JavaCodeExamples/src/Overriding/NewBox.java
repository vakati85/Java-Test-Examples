package Overriding;

public class NewBox extends Box {
	
	
// Overriding:When a method in the subclass has the same signature as a method in the super class,then subclass takes the precedence//
	// signature is nothing but method name and passing arguments//

	
	
	public void calculateVolume(int length, int width, int height){
		int Volume=length*width*height;
		System.out.println("Volume =" + Volume );
		
}
	
	public void calculateArea(int length,int width){
		
		int Area= length/width;
		System.out.println("Area = " + Area);
	}

	
	
}