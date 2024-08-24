public class IncrementDecrement { 
	public static void main(String[] args) { 
		int x = 5; 
		int y = ++x - x-- + --x + x++; 
		System.out.println(y); 
	}  
}

/*
	x=5 initialized.
	y=?
	++x means preincrement means x=5 then it becomes x=6
	then 
	x-- means postdecrement means now x=6 will consider after equation it will decrease to 5
	then
	--x means predecrement means first we have to minus so now x=5 it will becomes 4
	then 
	x++ means postincrement means it will remains the value of x which is 4 and after the equation it increase to again 5
	
	output will be 8
*/