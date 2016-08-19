package superKEywordEx;

public class SubBox extends Box{
	
	public void calculateVolume(int length,int width,int height){
		double Volume = super.calculateArea(length, width) * height;
		System.out.println("Volume =" + Volume);
	}

	

}
