package solutions;

public class BubbleSort {  
	
	public static void bubbleSort(int[] inputArray, int len)
	{
		for(int i=0; i<len; i++)
		{
			for(int j=0; j<len-1-i; j++)
			{
				if(inputArray[j] > inputArray[j+1])
				{
					swap(inputArray, j, j+1);
				}
			}
		}
	}
	
	//Swap logic
	static void swap(int[] inputArray, int firstIdx, int secondIdx)
	{
		int temp = inputArray[firstIdx];
		inputArray[firstIdx] = inputArray[secondIdx];
		inputArray[secondIdx] = temp;
	}
	
	//Printing the elements
	static void printSortedItem(int[] inputArray, int len)
	{
		System.out.println("Sorted items are:");
		for(int i=0; i<len; i++)
		{
			System.out.print(inputArray[i] + " ");
		}
	}
	
	public static void main(String[] args) 
	{
		int[] inputArray = {90, 34, 25, 12, 22, 11, 64};
		int len = inputArray.length;
		bubbleSort(inputArray, len);
		printSortedItem(inputArray, len);
	}
}
