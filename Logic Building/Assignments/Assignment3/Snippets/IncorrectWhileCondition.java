public class IncorrectWhileCondition { 
	public static void main(String[] args) { 
	int count = 5; 
	while (count = 0) { 
		System.out.println(count); 
		count--; 
		} 
	} 
}
/*
1.Because the system considers it as boolean and = is not comparison operator.
2.count = 0 is incorrect because there should be an comparison operator in a place of assignment operator. 
*/