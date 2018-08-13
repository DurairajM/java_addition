package java_addition;
import java.util.*;
public class methodoverloading {
	int add(int a,int b)
	{
		int c;
		c=a+b;
		return c;
	}
	double add(double a,double b)
	{
		double c;
		c=a+b;
		return c;
	}
	public static void main(String ar[])
	{
		methodoverloading g=new methodoverloading();
		System.out.println("The Sum of two integers is "+g.add(8,6));
		System.out.println("The Sum of two float values is "+g.add(9.1,5.2));
	}
}
