public class LoopVariableScope { 
	public static void main(String[] args) { 
		int x=0;
		for (int i = 0; i < 5; i++) { 
			x = i * 2; 
			//System.out.println(x);
		} 
		System.out.println(x); // Error: 'x' is not accessible here 
	}	 
}

/*
1.x is not accessible outside the loop because x is declared inside the for loop and after that 
there should one sop statement to print that x inside loop.
2.I change the code and run it which will run and x will be accessible.
3.We can also access outside the loop by initializing the x=0 and use sop statement outside loop condition.
*/