import java.util.*;
public class Ladder
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int persentage;
		System.out.print("Enter Your persentage: ");
		persentage = sc.nextInt();
		if(persentage>=90) {
			System.out.println("Your Grade is A");
		}
		else if(persentage>=80 && persentage<=89) {
			System.out.println("Your Grade is B");
		} else if(persentage>=60 && persentage<=79) {
			System.out.println("Your Grade is C");
		} else if(persentage>=33 && persentage<=59) {
			System.out.println("Your Grade is D");
		} else if(persentage>=0 && persentage<33) {
			System.out.println("Your Grade is f");
		} else {
			System.out.print("Invalid enput");
		}
	}
}