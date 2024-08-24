public class DoWhileIncorrectCondition { 
	public static void main(String[] args) { 
		int num = 5; 
		do { 
			System.out.println(num); 
			num++; 
		} while (num >= 0);
	}
}

/*
1.Do while loop run once atleast because there is not any loop condition like while and for loop.
2.The condition which is provided in do while loop is will never stop the loop process because
the loop will print all the condition which will greater than the 0 and there is not any stopping loop condition beacuse num++ is there which will
add the value which will be greater than 0.
*/