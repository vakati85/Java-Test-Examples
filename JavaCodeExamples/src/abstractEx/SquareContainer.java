package abstractEx;

public class SquareContainer extends Container{

	public double calculateAreaOfBase(int length) {
		 double Area = length * length;
		 System.out.println("Square Area=" + Area);
		 return Area;
	}
}
