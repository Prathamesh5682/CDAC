/*public class Main25 { 
	public static void main(String[] args) { 
		int number = 5; 
		switch(number) { 
			case 5: 
			System.out.println("Number is 5"); 
			break; 
			case 5: 
			System.out.println("This is another case 5"); 
			break; 
			default: 
			System.out.println("This is the default case"); 
		} 
	} 
}
*/
//case 5 is only there used again and again so the compiler gets the confusion which to print so compiler does not allow the 
//duplicates case label.
//duplicate case label so it will not work correct.

public class Main25 { 
	public static void main(String[] args) { 
		int number = 5; 
		switch(number) { 
			case 5: 
			System.out.println("Number is 5"); 
			break; 
			case 6: 
			System.out.println("This is another case 5"); 
			break; 
			default: 
			System.out.println("This is the default case");
		} 
	} 
}
