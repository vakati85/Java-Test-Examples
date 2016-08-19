package encapsulation;

public class Employee {
	// Encapsulation:Data and Methods that act on the data//
     
     //Example salary and bonus is data and calculatetotalpay is method that act on the data salary,bonus//
     //private,public, protected and default are called access modifiers//
	// if we use public visible everywhere in class,package,subclass and project,protected upto subclass,default visibility upto package//
	//private only upto class level//
	//Datahiding example//
	//datahiding is nothing but protecting the data not hiding the data.....//
  private double salary;
  private double bonus;
public void setSalary(double salary) {
	if(salary<40000&&salary>200000){
	this.salary = salary;
	
}
	else{ 
		this.salary=0;
		System.out.println("please check the salary");
	}
		
	}
public void setBonus(double bonus) {
	if(bonus<10000&&bonus>50000){
	this.bonus = bonus;
}
	else{
		this.bonus=0;
	}
}
public double getSalary() {
	return salary;
}
public double getBonus() {
	return bonus;
}
void calculateTotalPay(){
	double TotalPay=salary+bonus;
	System.out.println("TotalPay=" + TotalPay);
}
}
