public class IncorrectWhileLoopControl { 
	public static void main(String[] args) { 
		int num = 10; 
		while (num = 10) { 
			System.out.println(num); 
			num--; 
		} 
	} 
}

/*
1.incompatible type that integer cannot be converted to boolean.
2.Loop does not run indefinitely.
3.Condition in while loop is not wrong but int not converted to boolean.
4.num-- cannot decrement as loop condition gets an error.
5.main error is with assignment operator instead of that comparison operator should be used there.
*/