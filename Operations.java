
import java.util.Scanner;

public class Operations {
public static void main (String args[])
  {
    Scanner sc=new Scanner(System.in);
     System.out.println("Enter first number: ");
  int a=sc.nextInt();
  System.out.println("Enter Second number: ");
  int b=sc.nextInt();

   System.out.println("Difference of 2 numbers "+(a-b));
    System.out.println("Product of 2 numbers"+(a*b));
    System.out.println("Division of 2 numbers"+(a/b));
    System.out.println("Increment and Decrement of 2 numbers"+" "+(a++)+" "+(a--)+" "+(b++)+" "+(b--));
    System.out.println("Remainder of 2 numbers"+(float)(a%b));
   
  }


}

