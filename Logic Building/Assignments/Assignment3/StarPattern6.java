public class StarPattern6{
	public static void main(String args[]){
		int n=5;
		
		//for loop for rows from 1 to 5
		for(int i=n;i>=1;i--){
			
			//inner for loop spaces to print
			for(int j=n;j>i;j--){
				System.out.print(" ");
			}
			
			
			//inner for loop for stars to print
			for(int k=1;k<=(2*i-1);k++){
				System.out.print("*");
			}
			
			//next line
			System.out.println();
		}
	}
}
/*
*********
 *******
  *****
   ***
    *
*/