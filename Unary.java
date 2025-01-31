import java.util.*;
public class Unary
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    	
	int a;
	System.out.print("Enter value for a:");
	a=sc.nextInt();
	int b;
	System.out.print("Enter value for b:");
	b=sc.nextInt();
	System.out.println("Postincrement :"+(a++));
	System.out.println("Preincrement :"+(++a));
	System.out.println("Postdecrement :"+(b--));
	System.out.println("Predecrememnt :"+(--b));
	
	}
}