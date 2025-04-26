package day7;

public class FindEven_OddNumbersInArray {

	public static void main(String[] args) {
		int num[]= {2,33,84,72,5};
		int evenCounter= 0;
		int oddCounter=0;
		for (int i=0; i<num.length; i++)
		{
			if (num [i]%2==0)
			
			{
				//System.out.println("It's an Even number"); to identify even numbers BUT to count them use..
				evenCounter++;
				
			}
				
		
		else
		{
			// System.out.println("it's an Odd number"); to identify odd numbers BUT to count them use..
			oddCounter++;
		}


	}
		System.out.println("Number of Even numbers " +evenCounter);
		System.out.println("Number of Odd numbers " +oddCounter);
	

	}}
