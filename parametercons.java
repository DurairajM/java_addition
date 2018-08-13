package java_addition;
import java.util.*;
public class parametercons {
	int c;
	parametercons(int a,int b)
	{
		c=a+b;
		System.out.println("The Sum of "+a+"+"+b+"="+c);
	}
	public static void main(String ar[])
	{
		parametercons c=new parametercons(7,8) ; 
	}
}
