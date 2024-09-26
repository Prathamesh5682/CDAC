import java.lang.*;


class squareRoot{
	
	static double squareroot(double guess, double n, double epsilon){
		
		if(Math.abs(guess * guess - n) < epsilon){
			return guess;
		}
		
		double newGuess = (guess + n / guess) / 2.0;
		return squareroot(newGuess, n, epsilon);
	}
	
	static double square(int n){
		if(n==0 || n==1){
			return n;
		}
		
		double initialGuess = n/2.0;
		double epsilon = 1e-6;
		
		return squareroot(initialGuess, n, epsilon);
	}
	
	public static void main(String args[]){
		int n=5;
		System.out.println(square(n));
	}
}