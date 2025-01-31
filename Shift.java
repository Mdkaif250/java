import java.util.*;
public class Shift
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int a;
		System.out.print("Enter value for a:");
		a=sc.nextInt();
		int b;
		System.out.print("Enter value for b:");
		b=sc.nextInt();

		System.out.println("Left shift of a by b (a<<b) :"+(a<<b));
		System.out.println("Signed right shift of a by b (a>>b) :"+(a>>b));
		System.out.println("UnSigned right shift of a by b (a>>>b) :"+(a>>>b));

	}
}
