import java.util.Scanner;
public class Pattern1 {
	
	public static void Draw(int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=n-i;j>0;j--)
			{
				System.out.print("*");
			}
			System.out.println();;
		}
	}

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		n = sc.nextInt();
		sc.close();
		Draw(n);

	}

}
