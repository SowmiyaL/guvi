package logicalbuling;

import java.util.Scanner;

public class logical2 {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String a=s.nextLine();
		String b=s.nextLine();
		StringBuffer sb=new StringBuffer(a);
		StringBuffer sb1=new StringBuffer(b);
		while(true)
		{
			System.out.println("3.insert,4.delete,5.replace");
			int op=s.nextInt();
			
			switch(op)
			{
			case 3:
			{
				sb.deleteCharAt(s.nextInt());	
				System.out.println(sb);
				break;
			}
			case 4:
			{
				sb.insert(s.nextInt(),s.next().charAt(0));
				System.out.println(sb);
				break;
			}
			case 5:
			{
				sb.replace(2,3,"a");
				System.out.println(sb);
				break;
				
			}
				
			}
		}
		
		
		
			
		
		
	}

}
