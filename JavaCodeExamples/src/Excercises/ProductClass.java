package Excercises;

public class ProductClass {

	int productid;
	String name;
	double productprice;
	
	double total;
	
	
	public void purchase(int quantity) {
		
		System.out.println(name + "-Number of items purchase =" + quantity);
		
	}
	   
    public double calculateTotalPay(int quantity)
	{
		return (quantity*productprice);
	
		
	}
	
}
