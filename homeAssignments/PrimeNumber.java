package homeAssignments;

public class PrimeNumber {
public static void main(String[] args) {
		   {		
	       int i =0;
	       int num =0;
	       String  priNum = "";
	       for (i = 1; i <= 50; i++)         
	       { 		  	  
	          int var=0; 	  
	          for(num =i; num>=1; num--)
		  {
	             if(i%num==0)
		     {
	 		var = var + 1;
		     }
		  }
		  if (var ==2)
		  {
		     priNum = priNum + i + " ";
		  }	
	       }	
	       System.out.println("Prime numbers :");
	       System.out.println(priNum);
	   }
	}
}

