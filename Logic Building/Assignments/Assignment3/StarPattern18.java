public class StarPattern18{
	public static void main(String args[]){
		int n=4;
		
		//for loop for rows from 1 to 5
		for(int i=1;i<=n;i++){
			
			//inner for loop spaces to print
			for(int j=n-i;j>=1;j--){
				System.out.print(" ");
			}
			
			
			//inner for loop for stars to print
			for(int k=1;k<=(2*i-1);k++){
				System.out.print("* ");
			}
			
			//next line
			System.out.println();
		
		}
		for(int i=n-1;i>=1;i--){
			for(int j=n;j>i;j--){
				System.out.print(" ");
			}
			for(int j=1;j<=(2*i-1);j++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}