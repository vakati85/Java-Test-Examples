package NewRohiniExamples;

public class ArrayEx {

	public static void main(String[] args) {
		
      int[] A = {10,20,30,40,50};
      System.out.println(A[1] + " " +  A[4]);
      
      System.out.println("*************************");
      
     int[] X= new int[5];
     X[2]=50;
     X[4]=90;
     //   enhanced for //
       for(int temp : X)
       {
    	   System.out.println(temp);
       }
       System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&");
       
       String[] stx = new String[5];
       stx[0]="40"; 
       stx[3]="80";
       
      for(String temp1 : stx)
      {
    	  System.out.println(temp1);
      }
       System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
     String[] R=new String[5];
     R[0]="Rohini";
     R[1]="Prasanna kumar";
     R[2]="Anirudh Dikshit";
     R[3]="Nandan Dikshit";
     R[4]="vishwak";
     
    for(String temp2 : R){
    	System.out.println(temp2);
    	
    }
     		
     
    	  
    	  
      }
       
      
     
	}
