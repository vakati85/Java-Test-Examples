package abstractEx;

public abstract class Container {
	
	public void calculateVolume(int length,int height){
		double Volume = calculateAreaOfBase(length) * height;
		System.out.println("Volume =" + Volume);
	}
    public abstract double calculateAreaOfBase(int length);
}
