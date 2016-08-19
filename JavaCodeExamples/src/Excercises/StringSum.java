package Excercises;

public class StringSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] NUMS ={"10","20","30","40","50"};
		
		int total=0;
		
		for(String temp : NUMS){
			total =total + Integer.parseInt(temp);}
			System.out.println(total);
			
		}
 
	}


