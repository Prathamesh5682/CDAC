public class WhileLoopBreak { 
	public static void main(String[] args) { 
		int count = 0; 
		while (count < 5) { 
			System.out.print(count + " "); 
			count++; 
			if (count == 3) {
				break; 
			}
		} 
		System.out.println(count); 
	} 
}

/*
		count	n=5		Perform		output
		0		5		  0<5 Yes	 Print 0 
	
		increment count by 1 to check if condition so 1==3 not equal so not break
		
		
		1		5		   1<5 Yes	Print 1
		
		increment count by 1 to check if condition so 2==3 not equal so not break
		
		2		5		   2<5 Yes	Print 2
		
		increment count by 1 to check if condition so 3==3 is equal so break the statement and as break the loop will stop and outside the loop condition sop statement will print the count value as 3
		
		output - 0 1 2 3
		*/