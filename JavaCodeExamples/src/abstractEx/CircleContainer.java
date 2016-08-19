package abstractEx;
 
public class CircleContainer extends Container{

	
	

	public double calculateAreaOfBase(int length) {
		
		double Area = Math.PI*(length/2) *(length/2);
		System.out.println("Circle Area=" + Area);
		return Area;
		
		
	}
// Abstract Class:  Class which has empty methods and fully defined methods  //
	
	
}
