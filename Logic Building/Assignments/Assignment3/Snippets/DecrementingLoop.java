public class DecrementingLoop { 
	public static void main(String[] args) { 
		int total = 0; 
		for (int i = 5; i > 0; i--) { 
			total += i; 
			if (i == 3) {
				continue;
			}				
			total -= 1; 
		} 
		System.out.println(total); 
	} 
}

/*		Iteration 1.

		total = 0
		i=5,i>0 means 5>0 Yes enters into loop
		total = total + i
		total = 0+5 =5
		then if condition i is not equal to 3 so not inside if condition
		then total = total - 1
		means then total = 5 - 1 = 4
		Therefore by first iteration total=4
		
		Iteration 2.
		
		now i-- so i=5-1=4 then i=4
		total = 4
		i=4,i>0 means 5\4>0 Yes enters into loop
		total = total + i
		total = 4+4 = 8
		then if condition i is not equal to 3 so not inside if condition
		then total = total - 1
		means then total = 8 - 1 = 7
		Therefore by first iteration total=7
		
		
		Iteration 3.
		
		now i-- so i=4-1=3 then i=3
		total = 7
		i=3,i>0 means 3>0 Yes enters into loop
		total = total + i
		total = 7+3 = 10
		then if condition i is equal to 3 then inside if condition as we have used continue then it will skip the next step which total = total - 1.
		means then total remains unchanged total = 10
		
		
		Iteration 4.
		
		now i-- so i=3-1=2 then i=2
		total = 4
		i=2,i>0 means 2>0 Yes enters into loop
		total = total + i
		total = 10+2 = 12
		then if condition i is not equal to 3 so not inside if condition
		then total = total - 1
		means then total = 12 - 1 = 11
		Therefore by first iteration total=11
		
		
		Iteration 5.
		
		now i-- so i=2-1=1 then i=1
		total = 4
		i=1,i>0 means 1>0 Yes enters into loop
		total = total + i
		total = 11 + 1 = 12
		then if condition i is not equal to 3 so not inside if condition
		then total = total - 1
		means then total = 12 - 1 = 11
		Therefore by first iteration total=11
		
		iteration 6. 
		
		now i-- will get the condition false so it will not works and will stop the process because i=1-1=0 so 0>1 false condition.
		*/