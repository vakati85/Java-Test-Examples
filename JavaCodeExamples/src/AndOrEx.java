
public class AndOrEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=-10;
		if (a>0 && b>0){
			System.out.println("a and b are positive numbers");
		}
		else if(a>0 || b>0){
			System.out.println("atleast one number is positive");
	}
	else{
		System.out.println("both are negative numbers");
	}
	}
}