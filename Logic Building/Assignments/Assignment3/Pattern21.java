public class Pattern21{
	public static void main(String args[]){
		int n=5;
		int a = 1;
		for(int i=1;i<=n;i++){
			int num=1;
			//System.out.print(i);
			for(int j=1;j<=i;j++){
				System.out.print(num);
				if(j<i){
				System.out.print("*");
				}
				num=num+2;
			}
			
			System.out.println();
		}
	}
}