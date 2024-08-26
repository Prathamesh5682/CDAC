/*public class Main24 { 
	public static void main(String[] args) { 
		double score = 85.0; 
		switch(score) { 
			case 100: 
			System.out.println("Perfect score!"); 
			break; 
			case 85: 
			System.out.println("Great job!"); 
			break; 
			default: 
			System.out.println("Keep trying!"); 
		} 
	} 
}
*/
//In java switch case does not support the double or float data types.
//The switch can use the byte , short , int and char.
//Use int instead of double datatype.

public class Main24 { 
	public static void main(String[] args) { 
		int score = 85; 
		switch(score) { 
			case 100: 
			System.out.println("Perfect score!"); 
			break; 
			case 85: 
			System.out.println("Great job!"); 
			break; 
			default: 
			System.out.println("Keep trying!"); 
		} 
	} 
}