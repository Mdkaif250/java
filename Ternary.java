import java.util.*;
public class Ternary
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    	
	int a;
	System.out.print("Enter value for a:");
	a=sc.nextInt();
	int b;
	System.out.print("Enter value for b:");
	b=sc.nextInt();
	int c;
	System.out.print("Enter value for c:");
	c=sc.nextInt();
	int result;
	result=((a>b)?(a>c)?a:c:(b>c)?b:c);
	System.out.println("Max of 3 numbers="+result);
	}
	}
