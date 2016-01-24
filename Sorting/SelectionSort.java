import java.io.*;

class SelectionSort
{
 public static void main(String[] args)
 {
	SelectionSort obj = new SelectionSort();
	int numberOfElements;
	
	System.out.println("Enter number of elements in the array");
	numberOfElements = Integer.parseInt(System.console().readLine());
	
	int[] arr = new int[numberOfElements];
	//Enter elements to the array
	for(int i= 0; i<numberOfElements; i++)
        {
                arr[i] = Integer.parseInt(System.console().readLine());
        }
	obj.Sort(arr, numberOfElements);
	//Print after sorting
	for(int i= 0; i<numberOfElements; i++)
	{
		System.out.println(arr[i]);
	}
	
 }

/*
/ Code for selection sort
/ Select the smallest element
/ Find the smallest number in each pass 
/ and swap it with the first element
*/

 public void Sort(int[] arr, int n)
 {
	int temp,smallestIndex;
        for(int i= 0;i<n-1; i++)
	{
		smallestIndex = i;
		for(int j=i+1; j<n;j++)
		{
			if(arr[j]<arr[smallestIndex])
			{
				smallestIndex = j;
			}
		}
		if( i != smallestIndex)
		{
			temp = arr[i];
			arr[i]= arr[smallestIndex];
			arr[smallestIndex] = temp;
		}
	}
 }
}
