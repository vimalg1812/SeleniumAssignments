package homeAssignments;
public class Palindrome {
public static void main(String[] args) {
	
	int pal,temp,s,rem;
	pal=121;
	temp=pal;
for(s=0;pal>0;pal/=10)
{
rem=pal%10;
s=(s*10)+rem;
}

if(s==temp)
System.out.println(temp+" is a palindrome number ");
  else
System.out.println(temp+" is not a palindrome num	ber ");
	
}
}
