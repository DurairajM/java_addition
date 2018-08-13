package java_addition;
import java.util.*;
public class NANRfun {

	
		int a,b,c;
		Scanner s=new Scanner(System.in);
		public void add()
		{
			System.out.println("Enter the A value=");
			a=s.nextInt();
			System.out.println("Enter the B value=");
			b=s.nextInt();
			c=a+b;
		}
		public void sum()
		{
			System.out.println("The Sum of "+a+"+"+b+"="+c);
		}
		public static void main(String ar[])
		{
			NANRfun d=new NANRfun();
			d.add();
			d.sum();
		}
		}
	
