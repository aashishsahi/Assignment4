import java.util.Scanner;
public class Search {

	public static void main(String[] args) {
		
		int arr[] = {1,4,6,7,8,9,10};
		System.out.print("Array: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		int start = 0, end = (arr.length-1), mid, n;
		mid = (start + end)/2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to be searched: ");
		n = sc.nextInt();
		sc.close();
		while(start<=end)
		{
			if(n<arr[mid])
			{
				end = mid - 1;
			}
			else if(n==arr[mid])
			{
				System.out.println("Entered number is found at " + (mid+1) + " location.");
				break;
			}
			else
				start = mid + 1;
			mid = (start+end)/2;
		}
		
		

	}

}
