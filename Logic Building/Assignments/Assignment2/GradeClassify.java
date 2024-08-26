import java.util.*;


class GradeClassify{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int marks = sc.nextInt();
		
		if(marks>=90){
			System.out.println("A");
		}
		else if(marks>=80 && marks<=89){
			System.out.println("B");
		}
		else if(marks>=70 && marks<=79){
			System.out.println("C");
		}
		else if(marks>=60 && marks<=69){
			System.out.println("D");
		}
		else if(marks<=60){
			System.out.println("F");
		}
		else{
			System.out.println("Wrong Invalid");
		}
	}
}