package lab1;

public class Armstrong {

	public static void main(String[] args) 
	{
		int number =  371, orginalNumber, remainder, result =0;
		orginalNumber = number;
		while (orginalNumber != 0)
		{
			remainder = orginalNumber % 10;
			result += Math.pow(remainder,3);
			orginalNumber /=10;
		}
		if(result == number)
			System.out.println(number +" is an Armstrong number.");
		else
			System.out.println(number+ " is not an Armstrong number.");
	
			
			
				
	}

}
