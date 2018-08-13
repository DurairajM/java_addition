package java_addition;
import java.util.*;
	class addition
	{
		addition(int a,int b)
		{
			int c=a+b;
			System.out.println("The sum Of "+a+" and "+b+" is ---> "+c);
		}
	}
	class sum extends addition
	{
		sum(int a, int b) {
			super(a, b);
		}


	}
	public class inheritadd {
	public static void main(String ar[])
	{
		sum s=new sum(3,2);
	}
	}
