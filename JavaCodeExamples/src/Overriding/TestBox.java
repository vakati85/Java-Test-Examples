package Overriding;


public class TestBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Box ups=new Box();
		
		ups.calculateArea(6,8);
		
		NewBox Fedex=new NewBox();
		 
		Fedex.calculateVolume(4,6,7);
		Fedex.calculateArea(6,3);

	}

}
