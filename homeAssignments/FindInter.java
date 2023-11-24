package homeAssignments;

import java.lang.reflect.Array;

public class FindInter {
	
	public static void main(String[] args) {
		int [] a = {3,2,11,4,6,7};
		int [] b = {1,2,8,4,9,7};
		int alength= Array.getLength(a);
		
		System.out.println("The intersected numbers are : ");
		
		for(int i = 0; i<alength;i++)
		{
			for(int j=0;j<alength;j++)
			{
				if (a[i]==b[j])
				System.out.println(a[i]);
			}
				
	}

}
}
