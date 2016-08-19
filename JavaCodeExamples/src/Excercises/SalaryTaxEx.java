package Excercises;

public class SalaryTaxEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double salary=200000.00;
		double tax = 0.0;
		if(salary<=10000){
			tax=salary*.10;
		}
		else if(salary<40000){
			tax=salary*.20;
		}
		
		else if(salary<70000)
		{
			tax=salary*.30;
		}
		else{
		tax=salary*.40;}
		System.out.println("tax=" + tax);
	}

}
