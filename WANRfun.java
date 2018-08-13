package java_addition;
import java.util.*;
public class WANRfun {
	int a,b,c;
	Scanner s=new Scanner(System.in);
	public void add(int a,int b)
	{
		this.a=a;
		this.b=b;
		c=a+b;
		System.out.println("The Sum of "+a+"+"+b+"="+c);
	}
	public static void main(String ar[])
	{
		WANRfun b=new WANRfun();
		b.add(7,6);
}
}
