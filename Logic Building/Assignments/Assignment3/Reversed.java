public class Reversed{
	public static void main(String args[]){
		int number = 1234;
		int reversednum = 0;
		
		while(number != 0){
			int digit = number % 10;
			
			reversednum = reversednum * 10 + digit;
			
			
			number = number / 10;
			
		}
		System.out.println("Reversed number is: "+reversednum);
	}
}