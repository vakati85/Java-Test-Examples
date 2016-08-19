package inheritance;

public class NewBox extends Box{
	
	// if i can't modify class box then we create new box and adds extends box which includes box class all properties//
	//Inheritance :When a class  acquires properties of another class//
	//so newbox class calculatearea() methods but we cannot c in here //
	//This NewBox is called as subclass//
	
	
	
	public void calculateVolume(int length, int width, int height){
		int Volume=length*width*height;
		System.out.println("Volume =" + Volume );
		
	}

}
