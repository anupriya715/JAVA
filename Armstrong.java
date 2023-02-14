import java.util.Scanner;
public class Armstrong
{
	public static void main(String args[])
{
	int n,a,r,count=0,sum=0;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a number:");
	n=s.nextInt();
	int temp=n;
	a=n;
	while(a>0)
	{
		a=a/10;
		count++;
	}
	while(n>0)
	{
		r=n%10;
		sum=(int)(sum+Math.pow(r,count));
		n=n/10;
	}
	if(sum ==temp)
	{
		System.out.println(temp+"is an Armstrong number");
	}
	else
	{
		System.out.println(temp+"is not an Armstrong number");

	}
}
}
