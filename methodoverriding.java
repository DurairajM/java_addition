package java_addition;
import java.util.*;
 class addi
	{
		Scanner s=new Scanner(System.in);
	     public int a;
		public int add()
		{
			System.out.println("Enter A value=");
			a=s.nextInt();
			return a;
		}
		
	}

	class B extends addi
	{
		Scanner s=new Scanner(System.in);
		 public int b=20,cc;
		public int aa=super.a;
		public int add()
		{
			System.out.println("Enter B value=");
			b=s.nextInt();
		System.out.println("Enter B value="+b);
		return b;
		}

		
	}
	class C extends B
	{
		addi v=new addi();
		B n=new B();
		public void result()
		{
			int c1=v.add();
			int c2=n.add();
			int c3=c1+c2;
			System.out.println(c3);
		}
	}
	public class methodoverriding {
	public static void main(String ar[])
	{
		addi s0=new addi();
		addi s1=new B();
		C s2=new C();
		s2.result();
		
		
		
	}
	}
