public class ConditionalLoopOutput { 
	public static void main(String[] args) { 
		int num = 1; 
		for (int i = 1; i <= 4; i++) { 
			if (i % 2 == 0) { 
			num += i; 
			} 
			else { 
			num -= i; 
			} 
		} 
		System.out.println(num); 
	} 
}

/*
	iteration 1
	num is initialized 1 at start.
	In for loop i is initialized to 1 then check the loop condition i.e. i<=4 so 1<=4 if yes then inside loop here i is less than 4 so inside loop
	if condition i%2==0 means 1%2 should be contains the remainder as 0 means 1%2==0, but here 1%2 != 0 so else condition will run
	as num = num - i as num=1 and i=1 so num=1-1=0.
	Therefore num is set to 0.
	
	
	iteration2
	now num=0.
	In for loop i is initialized to 2 as i++ then check the loop condition i.e. i<=4 so 2<=4 if yes then inside loop here i is less than 4 so inside loop
	if condition i%2==0 means 2%2 should be contains the remainder as 0 means 1%2==0, but here 2%2 == 0 then if condition will run
	as num=num+1 so num=0 and i=2 so num=0+2=2.
	Therefore num is set to 2.
	
	iteration 3
	now num=2.
	In for loop i is initialized to 3 as i++ then check the loop condition i.e. i<=4 so 3<=4 if yes then inside loop here i is less than 4 so inside loop
	if condition i%2==0 means 3%2 should be contains the remainder as 0 means 1%2==0, but here 1%2 != 0 so else condition will run
	as num = num - i as num=2 and i=3 so num=2-3=-1.
	Therefore num is set to -1.
	
	
	iteration2
	now num=-1.
	In for loop i is initialized to 4 as i++ then check the loop condition i.e. i<=4 so 4<=4 if yes then inside loop here i is less than 4 so inside loop
	if condition i%2==0 means 4%2 should be contains the remainder as 0 means 1%2==0, but here 2%2 == 0 then if condition will run
	as num=num+1 so num=-1 and i=4 so num=-1+4=3.
	Therefore num is set to 3.
	
	output - 3
*/