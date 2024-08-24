public class LoopIncrement { 
	public static void main(String[] args) { 
		int count = 0; 
		for (int i = 0; i < 4; i++) { 
			count += i++ - ++i; 
		} 
		System.out.println(count); 
	} 
}

/*
	count = 0 initialized
	for loop i starts with 0 and condition is i<4 so lets check condition 
	i=0 so 0<4 Yes then inside the loop
	count = count + i++ - ++i where count=0 so count = 0 + 0 - 1=-1
	
	then i++
	next condition i becomes 1 as 1<4 Yes then inside loop
	count=-1 now count = -1 + 1 - 2 = -2
	
	then i++
	next condition i becomes 2 as 2<4 Yes then inside loop
	count=-2 now count = -2 + 2 - 3 = -3
	
	then i++
	next condition i becomes 3 as 3<4 Yes then inside loop
	count=-3 now count = -3 + 3 - 4 = -4
	
	then i++
	next condition i becomes 4 as 4 < 4 No so loop stops here 
	and console will print the output as -4.
*/