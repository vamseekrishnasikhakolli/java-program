import java.util.*;
class additionmatrix
  {
    public static void main(String args[])
    {
      int i,j,row,col;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter no of rows in matrix");
      row=sc.nextInt();
      System.out.println("enter no of col in matrix");
      col=sc.nextInt();
      int [][]a=new int[row][col];
     int [][]b=new int[row][col];
     int [][]res=new int[row][col];
    System.out.println("enter a matrix element");
      for(i=0;i<row;i++)
      {
        for(j=0;j<col;j++){
          a[i][j]=sc.nextInt();
        }
      }
      System.out.println("enter b matrix element");
      for(i=0;i<row;i++)
        {
          for(j=0;j<col;j++)
            {
              b[i][j]=sc.nextInt();
            }
        }
      System.out.println("enter result matrix element");
                         for(i=0;i<row;i++)
                           {
                             for(j=0;j<col;j++)
                               {
                                 res[i][j]=a[i][j]+b[i][j];
                               }
                           }
      for(i=0;i<row;i++)
        {
        for(j=0;j<col;j++)
          {
            System.out.println(res[i][j] );
          }
        }
    }
  }