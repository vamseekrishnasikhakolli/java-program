import java.util.*;
class digits
{
public static void main(String args[])
{
int n,count=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter the digits");
n=sc.nextInt();
while(n>0)
{
n=n%10;
count++;
n=n/10;
}
System.out.println("no of digits is given are "+count);
}
}