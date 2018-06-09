import java.util.Scanner;
public class ReverseNumber {
	
	public static void Number()
	{
		int n,s=0,r;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to be reversed: ");
		n = sc.nextInt();
		sc.close();
		while(n!=0)
		{
			r = n%10;
			s = s*10 + r;
			n = n/10;
		}
		System.out.println("Reverse of number is: " + s);
	}

	public static void main(String [] args)
	{
		Number();
	}
}
