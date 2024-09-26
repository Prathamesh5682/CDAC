import java.lang.*;
import java.util.Scanner;

class ArmStrong{
	
	static boolean isArmstrong(int number){
		double originalNum = number;
		double result = 0;
		double numberOfDigits = String.valueOf(number).length();
		
		while(number > 0){
			double digit = number % 10;
			result = result + Math.pow(digit, numberOfDigits);
			number = number / 10;
		}
		
		return result == originalNum;
	}
	
		
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
			
		if(isArmstrong(number)){
			System.out.println("Given number is an armStrong number : "+ number);
		}
		else{
			System.out.println("Given number is not an armStrong number : " +number);
		}
	}
}	