import java.util.*;
class evenandodd
  {
    public static void main(String args[])
    {
      int n;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter even or odd element in an array");
      n=sc.nextInt();
      int arr[]=new int[n];
      for(int k=0;k<n;k++)
        {
          arr[k]=sc.nextInt();
        }
      int count_odd=1,count_even=0;
      for(int k=0;k<n;k++)
        {
          if(arr[k]%2==1)
            count_odd++;
          else
            count_even++;
        }
      System.out.println("odd:"+count_odd);
      System.out.println("even:"+count_even);
    }
  }