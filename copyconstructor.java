package java_addition;
import java.util.*;
public class copyconstructor {
	int a,b;
	copyconstructor(int a,int b)
	{
		System.out.println("The Sum of two numbers using COPY CONSTRUCTOR");
		this.a=a;
		this.b=b;
	}
	copyconstructor(copyconstructor c)
	{
		a=c.a;
		b=c.b;
		System.out.println("The sum is "+(a+b));
		
	}
	public static void main(String ar[])
	{
		copyconstructor v=new copyconstructor(3,2);
		copyconstructor u=new copyconstructor(v);
		
	}

}
