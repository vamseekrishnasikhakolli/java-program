import java.util.*;
class reverse
  {
    public static void main(String args[])
    {
      String s="hello world";
      String s1=" ";
      for(int i=s.length()-1;i>=0;i--)
        {
          s1=s1+s;
        }
      System.out.println(s1);
    }
  }