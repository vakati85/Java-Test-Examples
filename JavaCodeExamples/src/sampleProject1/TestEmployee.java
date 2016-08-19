package sampleProject1;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Employee Linda=new Employee("Linda",9);
        Employee Alex=new Employee("Alex",5);
        Employee John=new Employee("John",3);
        Employee Sara=new Employee("Sara",7);
        Employee Joe=new Employee("Joe",4);
        
        Department Sales=new Department("sales");
        Department IT=new Department("IT");
        
        Sales.addEmployee(Alex);
        Sales.addEmployee(Linda);
        Sales.addEmployee(John);
        IT.addEmployee(Sara);
        IT.addEmployee(Joe);
        
        Sales.describe();
        System.out.println("-------------------");
        IT.describe();
	}

}
