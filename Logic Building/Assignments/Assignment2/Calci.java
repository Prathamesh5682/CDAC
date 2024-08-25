import java.util.*;


public class Calci{
	public static void main(String args[]){
		double num1 = 23;
		double num2 = 0;
		
		Scanner sc = new Scanner(System.in);
		char character = sc.next().charAt(0);
		
		double result = 0;
		boolean validationoperation = true;
		switch(character){
			case '+':
				result = num1 + num2;
				break;
			
			case '-':
				result = num1 - num2;
				break;
			
			case '*':
				result = num1 * num2;
				break;
			
			case '/':
				if(num2 != 0){
					result = num1 / num2;
				}
				else{
					validationoperation = false;
					System.out.println("Division by zero is not allowed");
				}
				break;
			
			default :
				validationoperation = false;
				System.out.println("Invalid Entry");
				break;
		}
		
		
		if(validationoperation){
			System.out.println("The result is: " +result);
		}
		
	}
}			