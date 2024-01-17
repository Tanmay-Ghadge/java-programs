package java_Interview_Questions;

public class CountNumberOfDigits
{
	
	
	//Count words in a string
	
	
	
	//largest of three digits
	//maximum and minimum number of the array
	//Duplicates in a string
	//Number of occurrence of a String
	//Remove special characters
	//Replace spaces with a character
	//prime number
//-------------------------------------------------------------------------
	
	//reverse number
	public static void reverseNumber(int numberToReverse)
	{
		int reverseNumber = 0;
		int lastDigit=0;
		while(numberToReverse>0)
		{
			lastDigit=numberToReverse%10;
			reverseNumber=reverseNumber*10+lastDigit;
			numberToReverse=numberToReverse/10;
		}
		
		System.out.println(reverseNumber);
	}
	
	//reverse String
	public static void reverseString(String stringToReverse)
	{
		String reversedString="";
		
		for(int i=stringToReverse.length()-1;i>=0;i--)
		{
			char letter=stringToReverse.charAt(i);
			reversedString=reversedString+letter;
		}
		System.out.println(reversedString);
	}
	
	//count even and odd in a number
	public static void countEvenAndOdd(int number)
	{
		int digit=0;
		int evenNumberCount=0;
		int oddNumberCount=0;
		while(number>0)
		{
			digit=number%10;
			if(digit==0)
			{
				System.out.println(digit+" is even number");
				evenNumberCount++;
			}
			else
			{
				System.out.println(digit+" is odd number");
				oddNumberCount++;
			}
			digit=0;
			number=number/10;
		}
		System.out.println(evenNumberCount+" evenNumberCount");
		System.out.println(oddNumberCount+" oddNumberCount");
	}
	
	//Count number of digits in a number
	public static void countNumberOfDigits(int number)
	{
		int numberOfDigits = 0;
		while(number>0)
		{
			number=number/10;
			numberOfDigits++;
		}
		System.out.println(numberOfDigits);
	}
	
	//Factorial of a number
	public static void factorialOfNumber(int number)
	{
		int factoial=1;
		for(int i=number;i>1;i--)
		{
			factoial=factoial*i;
		}
		System.out.println(factoial);
		System.out.println(5*4*3*2);
		
	}
	public static void main(String[] args) 
	{
		CountNumberOfDigits.reverseNumber(12345);//pass
		CountNumberOfDigits.reverseString("Tanmay");//pass
		CountNumberOfDigits.countEvenAndOdd(123456);//fail
		CountNumberOfDigits.countNumberOfDigits(55555);//pass
		CountNumberOfDigits.factorialOfNumber(5);//pass
		countNumberOfDigits(6151);//pass
		
	}

}
