import java.util.Scanner;
public class EvenNumbers {
	
	public static void Even(int n)
	{
		System.out.println("Even numbers: ");
		for(int i=2;i<=n;i++)
		{
			if(i%2==0)
				System.out.println(i);
		}
	}

	public static void main(String[] args) {
		
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		n = sc.nextInt();
		sc.close();
		Even(n);

	}

}
