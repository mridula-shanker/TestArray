import java.util.Arrays;

public class ArrayTesting 
{

	public static void main(String[] args) 
	{
		int[] myArray = new int [20];
		for(int i=0; i <myArray.length; i++)
		{
			myArray[i] = (int)(Math.random() *20)+1;
			System.out.println("The average: " + average(myArray));
			System.out.println("13 apears " + isPresent(myArray,13));
			System.out.println("at index " + indexOf(myArray,13));
			System.out.println(Arrays.toString(myArray));
		}
		
	}

	private static double average(int[] arr)
	{
		double sum = 0;
		for(int num : arr)
		{
			sum += num;
		}
		return sum/arr.length;
	}
	
	private static boolean isPresent(int[] arr, int target)
	{
		for(int num : arr)
		{
			if(num == target)
				return true;
		}
		return false;
	}
	
	/**
	 * returns the first occurance of target value
	 * @param arr		array
	 * @param target	target value
	 * @return			the index of the first occurance of target or -1 if not found
	 */
	private static int indexOf(int[] arr, int target)
	{
		for(int i=0; i<arr.length;i++)
		{
			if(arr[i]== target)
				return i;
		}
		return -1;
	}
	
	
}
	