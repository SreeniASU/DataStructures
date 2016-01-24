import java.io.*;

class InsertionSort
{
 public static void main(String[] args)
 {
	InsertionSort obj = new InsertionSort();
	int numberOfElements;
	System.out.println("Enter number of elements in the array");
	numberOfElements = Integer.parseInt(System.console().readLine());
	int[] arr = new int[numberOfElements];
	//Input the elements to the array
	
	for(int i=0; i<numberOfElements; i++)
	{
		arr[i] =  Integer.parseInt(System.console().readLine());
	} 
	obj.InsertionSort(arr, numberOfElements);
	
	//Print the elements in the array
	for(int i=0; i<numberOfElements; i++)
	{
		System.out.println(arr[i]);
	}
 }

public void InsertionSort(int[] arr, int n)
{
 	int j; 
	for(int i=1; i<n; i++)
	{			
		int key = arr[i];
		for(j = i-1;j>=0;j--)
		{
			if(arr[j]>key)
			{
				arr[j+1] = arr[j];
			}
		}
		arr[j+1] = key;
		
	}
}

}
