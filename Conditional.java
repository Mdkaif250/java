import java.util.*;
public class Conditional
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int a;
		System.out.print("Enter value ");
		a = sc.nextInt();
		if(a%2==0) {
			System.out.println("The number is even");
		}
	}
}