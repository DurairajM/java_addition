package java_addition;
import java.util.*;
public class defaultconstructor {
	int a,b,c;
	Scanner s=new Scanner(System.in);
	defaultconstructor()
	{
		System.out.println("Enter the A and B values=");
		a=s.nextInt();
		b=s.nextInt();
	    c=a+b;
	    System.out.println("The Sum is "+c);
	}
	public static void main(String ar[])
	{
		defaultconstructor d=new defaultconstructor(); 
	}
}
