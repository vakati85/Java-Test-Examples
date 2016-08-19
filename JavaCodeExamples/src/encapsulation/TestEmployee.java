package encapsulation;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Employee Alex=new Employee();
     
     Alex.setSalary(1000000);
     Alex.setBonus(90000);
     Alex.getBonus();
     Alex.getSalary();
     Alex.calculateTotalPay();
     
}
}