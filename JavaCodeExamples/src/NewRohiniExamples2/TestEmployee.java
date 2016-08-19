package NewRohiniExamples2;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// passing values to parameters//
		Employee A=new Employee();
		Employee B=new Employee();
		Employee C=new Employee();
		
	
		A.salary=100000.00;
		A.bonus=9000.99;
		double totalPay1=A.calculateTotalPay(150000,3000);
		
		
		
		B.salary=110000.90;
		B.bonus=11000.45;
		double totalPay2=B.calculateTotalPay(120000,12000);
		
	
		C.salary=135000;
		C.bonus=14000;
		double totalPay3=C.calculateTotalPay(70000,2000);
		
		System.out.println("Total of all employees =" + (totalPay1+totalPay2+totalPay3));
		
		
		

	}

}
