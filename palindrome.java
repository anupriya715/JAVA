import java.io.*;
import java.util.*;
class palindrome
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int remainder,reverse=0;
System.out.println("enter a number");
int n=sc.nextInt();
int num=n;
while(n!=0)
{
remainder=n%10;
reverse=reverse*10+remainder;
n/=10;
}
if(reverse==num)
{
System.out.println("The number is a palindrome"+num);
}
else
{
System.out.println("The number is not a palindrome"+num);
}

}
}

