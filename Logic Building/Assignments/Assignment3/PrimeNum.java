public class PrimeNum{
	public static void main(String args[]){
		int count = 0;
		int num = 2;
		
		while(count<5)
			int divisorCount = 0;
			
			
			for(int i=1;i<=num;i++){
				if(num % i == 0){
					divisorCount++;
				}
			}
			
			if(divisorCount == 2){
				System.out.println(num);
				count++;
			}
			
			num++;
	}
}