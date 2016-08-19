package NewRohiniExamples2;

public class Employee {
        
        double salary;//class level data//
        double bonus;
        // Encapsulation:Data and Methods that act on the data//
        
        //Example salary and bonus is data and calculatetotalpay is method that act on the data salary,bonus//
        
        double calculateTotalPay(double salary,double bonus) {
        	// if we use this.salary and this.bonus we can get access to class level salary and bonus//
        	//otherwise  access is on  method level bonus and salary//**
        	
        	double TotalPay=this.salary+this.bonus;
        	System.out.println("TotalPay=" + TotalPay);
        	return TotalPay;
        }
	// object is an instance of class or copy of class...//
        // class is a template of object//
        // class has data and methods//

}