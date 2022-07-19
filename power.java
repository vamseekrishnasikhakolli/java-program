import java.util.*;
class power
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter number");
      int n=sc.nextInt();
      System.out.println("enter exponential");
      int i=sc.nextInt();
      int result=1;
      for(;i!=0;--i)
        {
          result=result*n;
        }
      System.out.println("result is :"+result);
    }
  }