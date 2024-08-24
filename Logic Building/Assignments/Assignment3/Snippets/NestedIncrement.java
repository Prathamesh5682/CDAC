public class NestedIncrement { 
	public static void main(String[] args) { 
		int a = 10; 
		int b = 5; 
		int result = ++a * b-- - --a + b++; 
		System.out.println(result); 
	} 
}

/*
	a=10 initialized
	b=5 initialized
	now ++a means preincrement it will become 10 to 11 before the equation
	then b-- means postdecrement it will change its value after the equation takes place 
	means b-- will change its value from 5 to 4 for last where b++ is there
	and --a means predecrement as 10 to 11 then again 10 due to predecrement
	
	so output will be 49 as = 11*5-10+4 = 49
*/