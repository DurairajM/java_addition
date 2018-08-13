package java_addition;
import java.util.*;
public class cons_overloading {
	int a,b,c;
	Scanner s=new Scanner(System.in);
	cons_overloading()
	{
		System.out.println("Addition Of Two Numbers");
		
	}
	cons_overloading(int b)
	{
		System.out.println("Enter the A value=");
		a=s.nextInt();
		this.b=b;
		c=a+b;
		
		System.out.println("The Sum of "+a+"+"+b+"="+c);
	}
	public static void main(String ar[])
	{
		cons_overloading b0=new cons_overloading();
		cons_overloading b1=new cons_overloading(6);
	
	}
}
