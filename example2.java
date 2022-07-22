import java.util.*;
class example2
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter string ");
      String str=sc.nextLine();
      int count =1;
      for(int i=0;i<str.length()-1;i++)
        {
          if(str.charAt(i)==' ') {
             if(str.charAt(i+1)!=' ')
          {
            count++;
          }
        }
        }
      System.out.println("number of words in a string:"+count);
    }
  }