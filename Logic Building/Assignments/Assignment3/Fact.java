public class Fact{
	public static void main(String args[]){
		int n = 10,result = 1;
		for(int i=10;i>=1;i--){
			result = result * i;
		}
		System.out.println("The Factorial of 10 is: "+result);
	}
}