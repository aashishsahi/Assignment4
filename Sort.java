
public class Sort {
	

	public static void main(String[] args) {
		
		int arr[] = {1,1,1,1,0,0,1,0};
		int n = arr.length;
        for (int i=1; i<n; i++)
        {
            int key = arr[i];
            int j = i-1;
            while (j>=0 && arr[j] > key)
            {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
        System.out.print("Sorted array: ");
        for(int i=0;i<arr.length;i++)
        {
        	System.out.print(arr[i] + " ");
        }
	}

}
