import java.util.*;
class removeduplicatechars
  {
    public static void main(String args[])
    {
      String str1="vamsee",str2="";
      for(int i=0;i<str1.length();i++)
        {
          int count=0;
          for(int j=0;j<=i;j++)
            {
              if(str1.charAt(i)==str1.charAt(j))
                count++;
              if(count>1)
                break;
            }
          if(count==1)
            str2=str2+str1.charAt(i);
        }
      System.out.println(str2);
    }
  }