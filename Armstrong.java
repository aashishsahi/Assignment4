import java.util.Scanner;
public class Armstrong {
	
	public static void Check(int n)
	{
		int a = n, r,s=0, b = n, r1=1;
		int i=0;
		while(b!=0)
		{
			i=i+1;
			b = b/10;
		}
		while(n!=0)
		{
			r = n%10;
			r1 = 1;
			for(int j=1;j<=i;j++)
			{
				r1 = r1 * r;
			}
			s = s + r1;
			n = n/10;
		}
		if(a==s)
			System.out.println("Entered number is armstrong.");
		else
			System.out.println("Entered number is not armstrong.");
	}

	public static void main(String[] args) {
		
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		n = sc.nextInt();
		sc.close();
		Check(n);

	}

}
