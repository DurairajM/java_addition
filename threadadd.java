package java_addition;
import java.util.*;
class th extends Thread
{
	int a=10,b=30,c;
	public void run()
	{
		try
		{
			System.out.println("The Sum Of "+a+"+"+b+"="+(a+b)+"for the "+getName());
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
public class threadadd {
public static void main(String h[])
{
	th t=new th();
	t.start();
}

}
