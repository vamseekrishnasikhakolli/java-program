import java.util.*;
class nonrepeatingchar
  {
  public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
   String str=sc.nextLine();
      for(char i:str.toCharArray())
        {
          if(str.indexof(i)==str.lastindexof(i))
          {
            System.out.println("frist non-repeatingcharacter is:"+i);
            break;
          }
        }
    }
  }