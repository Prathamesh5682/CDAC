public class SumDigit{
	public static void main(String args[]){
		int number = 9876;
		int re=0;
		
		while(number>0){
			int digit = number % 10;
			
			re = re + digit;
			
			number /= 10;
		}
		System.out.println(re);
	}
}