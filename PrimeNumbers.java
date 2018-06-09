import java.util.Scanner;
public class PrimeNumbers {
	
	public static void Prime(int n)
	{
		int f=0;
		System.out.println("Prime numbers: ");
		for(int i=2;i<=n;i++)
		{
			f=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					f=1;
					break;
				}
					
			}
			if(f==0)
				System.out.println(i);
		}
	}

	public static void main(String[] args) {
		
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		n = sc.nextInt();
		sc.close();
		Prime(n);
		

	}

}
