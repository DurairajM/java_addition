package java_addition;
import java.util.*;
public class NAWRfun {

	int a,b,c;
	Scanner s=new Scanner(System.in);
	public int add()
	{
		System.out.println("Enter the A value=");
		a=s.nextInt();
		System.out.println("Enter the B value=");
		b=s.nextInt();
		c=a+b;
		return c;
	}
	public static void main(String ar[])
	{
		NAWRfun d=new NAWRfun();
		int e;
		e=d.add();
		System.out.println("The sum of "+d.a+"+"+d.b+"="+e);
	}

}
