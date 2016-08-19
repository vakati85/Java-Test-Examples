package sampleProject1;

public class Department {
    
	private  String deptName;
	private  int budget; 
	
  // int[]  X = new int[5]\\
	
	private Employee[] emps=new Employee[5];
	private int counter=0;
	
	public Department(String deptName){
		
		this.deptName=deptName;
		this.budget=50000;
	}
	 public void addEmployee(Employee obj)
	 { 
		 emps[counter]=obj;
		 counter++;
	 
	if(obj.getGrade()>5){
		this.budget+=150000;
	}
	else{
		this.budget+=100000;
	}
	}
	
	public void describe()
	{
		String temp ="Dept Name :" + this.deptName + "\nBudget : " + this.budget +"\nEmployees :";
		System.out.println(temp);
		
		for(Employee X : emps)
		{  
			if(X !=null){
			temp += X.getEmpInfo() + " ";
		}
			
		}
		System.out.println(temp);
	}
}
