import java.util.*;
class firstandlast
  {
    public static void main(String args[])
    {
      int firstdigit =0,lastdigit=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter number");
      int n=sc.nextInt();
      lastdigit =n%10;
      //System.out.println("last digit of number:"+lastdigit);
      while(n!=0)
        {
          firstdigit=n%10;
          n=n/10;
        }
      
      System.out.println("first digit of number:"+firstdigit);
      System.out.println("last digit of number:"+lastdigit);
    }
  }