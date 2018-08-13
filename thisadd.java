package java_addition;
import java.util.*;
public class thisadd {
	int num1,num2,sum;
	int fun(int num1,int num2)
	{
		this.num1=num1;
		this.num2=num2;
		sum=num1+num2;
		return sum;
	}
	public static void main(String ar[]){
		thisadd k=new thisadd();
		System.out.println(k.fun(7, 6));
	}
}
