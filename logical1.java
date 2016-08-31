package logicalbuling;


import java.util.*;

public class logical1 {
	
	public static void main(String args[])
	{
		Scanner s =new Scanner(System.in);
		int a=s.nextInt();
		int n,count=0,b;
		b=a;
		while(b!=0)
		{
			
			b=b/10;
			count++;
		}
		int m1[]=new int[count];
		b=a;
		while(b!=0)
		{
		n=b%10;
		count--;
			m1[count]=n;
		b=b/10;
		}
		Arrays.sort(m1);
		for(int i=0;i<2;i++)
		{
			System.out.print(m1[i]);
		}
	}
	

}
