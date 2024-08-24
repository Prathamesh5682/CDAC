public class StarPattern4{
	public static void main(String args[]){
		int n=5;
		
		//for loop for rows from 1 to 5
		for(int i=1;i<=n;i++){
			
			//inner for loop spaces to print
			for(int j=n-i;j>=1;j--){
				System.out.print(" ");
			}
			
			
			//inner for loop for stars to print
			for(int k=1;k<=i;k++){
				System.out.print("* ");
			}
			
			//next line
			System.out.println();
		}
	}
}

/*
    *
   ***
  *****
 *******
*********
*/