import java.util.*;
class sumofdigit
  {
    public static void main(String args[])
    {
      int n,sum=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter sum of digit number");
      n=sc.nextInt();
      while(n>0)
        {
          n=n%10;
          sum=sum+n;
          n=n/10;
        }
      System.out.println("sum"+sum);
    }
  }