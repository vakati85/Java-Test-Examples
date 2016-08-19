package Excercises;

public class ProductObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductClass Applephone=new ProductClass();
		ProductClass Samsunggalaxy=new ProductClass();
		ProductClass Blackberry=new ProductClass();
		 
		Applephone.name="iphone";
		Applephone.productid=1;
		Applephone.productprice=699.99;
		
		System.out.println(Applephone.name);
		System.out.println(Applephone.productid);
		System.out.println(Applephone.productprice);
		
		Applephone.purchase(5);
		System.out.println(Applephone.calculateTotalPay(5));
		
		Samsunggalaxy.productid=2;
		Samsunggalaxy.productprice=799.99;
		Samsunggalaxy.name="samsungs5";
		
		System.out.println(Samsunggalaxy.name);
		System.out.println(Samsunggalaxy.productid);
		System.out.println(Samsunggalaxy.productprice);
		
		
		
		Samsunggalaxy.purchase(8);
		System.out.println(Samsunggalaxy.calculateTotalPay(8));
		
		Blackberry.name="Blackberry 5";
		Blackberry.productid=3;
		Blackberry.productprice=399.97;
		
		System.out.println(Blackberry.name);
		System.out.println(Blackberry.productid);
		System.out.println(Blackberry.productprice);
		
		
		Blackberry.purchase(9);
        System.out.println(Blackberry.calculateTotalPay(9));

	}

}
