package logicalbuling;
import java.util.Arrays;
import java.util.Scanner;


public class logical4 {


public static void main(String[] args) 
{
        Scanner s = new Scanner(System.in);
       System.out.print("enter the  n number");
       int n = s.nextInt();
        int[] a = new int[n];

          for(int i= 0; i < n; i++)
          {
        	  a[i] = s.nextInt();
        	  
          }
          Arrays.sort(a);
          
         
          for(int k=n-1;k>=0;k--)
          {
        	  System.out.println(a[k]);
          }


}
}


