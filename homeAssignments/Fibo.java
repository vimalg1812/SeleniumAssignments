package homeAssignments;

public class Fibo {

	public static void main(String[] args) {
		
		int a,b,c;
		a=0;b=1;
		System.out.println("The Fibonacci Series");
		System.out.print(a+","+b+",");
		
		for(int i=2;i<8;i++)
		{
			c=a+b;
			System.out.print(c+",");
			a=b;
			b=c;
		}
		
	}
	
	
}
