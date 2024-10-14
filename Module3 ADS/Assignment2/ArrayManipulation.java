import java.util.*;


class ArrayManipulation{
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size : ");
		
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		System.out.println("Enter operations : ");
		int operations = sc.nextInt();
		
		int maxnum = 0;
		
		for(int i=0;i<operations;i++){
			System.out.println("Entry query : ");
			int index1 = sc.nextInt() -1;
			int index2 = sc.nextInt() -1;
			int num = sc.nextInt();
			
			for(int j=index1 ; j<=index2; j++){
				arr[j] += num;
				
				maxnum = arr[j] > maxnum ? arr[j] : maxnum;
			}
		}
		
		System.out.println(maxnum);
	}
}