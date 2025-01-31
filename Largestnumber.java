import java.util.Scanner;
public class Largestnumber {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a: ");
		int a = scanner.nextInt();
		System.out.print("Enter b: ");
		int b = scanner.nextInt();
		System.out.print("Enter c: ");
		int c = scanner.nextInt();
		int largest,smallest,middle;
		if(a>=b&&a>=c)
		{
			largest=a;
		}
		else if(b>=a&&b>=c)
		{
			largest=b;
		}
		else {
			largest=c;
		}
		if (a<=b&&a<=c)
		{
			smallest=a;
		} else if(b<=a&&b<=c)
		{
			smallest=b;
		} else
		{
			smallest=c;
		}
		middle=a+b+c-largest-smallest;

		System.out.println("Largest:"+largest);
		System.out.println("Smallest:"+smallest);
		System.out.println("Middle:"+middle);
	}
}