 import java.util.*;
class NeonNumber
{
	public static void main(String args[])
{
	int sum=0,n;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number to check");
	n=sc.nextInt();
	int square=n*n;
	while(square!=0)
	{
		int digit=square%10;
		sum=sum+digit;
		square=square/10;
	}
	if(n==sum)
	System.out.println("is a neon number"+n);
	else
	System.out.println("is not a neon number"+n);
}
}
