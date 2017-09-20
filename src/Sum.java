import java.util.Scanner;

public class Sum {
	int a,b,s;
	public void add(int a,int b)
	{
		this.a=a;
		this.b=b;
		while(b!=0)
		{	int carry=a&b;
			a=a^b;
			b=carry<<1; 
		}
	System.out.println("sum is "+a);
		
		
	}


public static void main(String args[])
{
Sum ob=new Sum();
int x,y;
System.out.println("enter the numbers");
Scanner s=new Scanner(System.in);
x=s.nextInt();
y=s.nextInt();
ob.add(x,y);
}
}