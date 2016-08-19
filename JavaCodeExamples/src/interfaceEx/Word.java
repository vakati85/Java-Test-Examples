package interfaceEx;

public class Word implements Office {
	
	//Interface: is a class with only empty methods and used to bring consistency across various classes//
	public void New(){
		System.out.println("Word New .doc");
	}
	public void Open(){
		System.out.println("Word Open .doc");
	}
	public void Save(){
		System.out.println("Word Save .doc");
	}
	

}
