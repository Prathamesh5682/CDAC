import java.lang.*;
import java.util.Scanner;

class primeNumber{
	
	static int prime(int n, int i){
		
		if(n<=1){
			return 0;
		}
		if(i==1){
			return 1;
		}
		if(n%i==0){
			return 0;
		}
		
		return prime(n, i-1);
			
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		if(prime(n, n-1)==1){
			System.out.println(n+" is a Prime Number");
		}
		else{
			System.out.println(n+" is not a Prime Number");
		}
	}
}