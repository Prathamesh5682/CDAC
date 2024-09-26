import java.util.Scanner;


class Fact{
	
	static int fact(int n){
		
		if(n<=1){
			return 1;
		}
		return n*fact(n-1);
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for factorial : ");
		int n = sc.nextInt();
		
		System.out.print(fact(n));
	}
}