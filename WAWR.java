package java_addition;
import java.util.*;
public class WAWR {
	int a,b,c;
	Scanner s=new Scanner(System.in);
	public int add1(int a,int b)
	{
		this.a=a;
		this.b=b;
		c=this.a+this.b;
	    return c;
	}
	public static void main(String ar[])
	{
		WAWR o=new WAWR();
		int c=o.add1(7,6);
		System.out.println("The Sum of "+o.a+"+"+o.b+"="+c);
	}
}
