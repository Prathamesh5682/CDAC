import java.util.Scanner;


public class GCD {

    static int gcd(int n1, int n2){
		if(n2 != 0){
			return gcd(n2, n1 % n2);
		}
		else{
			return n1;
		}
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		
		System.out.println(gcd(n1,n2));
	}
}