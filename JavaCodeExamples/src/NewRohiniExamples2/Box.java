package NewRohiniExamples2;

public class Box {
	//polymorphism example//
	//overloading example;;//
	//overloading definition; when the methods of same name are differentiated by their passing arguments.//
	
	
  void calculateArea(int length){
	  System.out.println( "Area=" + (length*length));
  }
  void calculateArea(double length){
	  System.out.println("Double Area=" + (length*length));
  }
  
  void calculateArea(int length,int width){
	  System.out.println("Area=" + (length*width));
  }
		 
	  
  

}
