import java.util.*;
class copy
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int n;
      System.out.println("enter size of element in array");
      n=sc.nextInt();
      int arr1[]=new int[n];
       System.out.println("enter the array elements ");
      for(int i=0;i<n;i++)
        {
          
          arr1[i]=sc.nextInt();
        }
      System.out.println("Copied elements are");
      int arr2[]=new int [n];
        for(int i=0;i<n;i++)
        {
          arr2[i]=arr1[i];
          System.out.println(arr2[i]+"");
        }
    }
  }