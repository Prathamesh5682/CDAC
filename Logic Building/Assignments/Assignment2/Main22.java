/*public class Main22 { 
	public static void main(String[] args) { 
		int value = 2; 
		switch(value) { 
			case 1: 
				System.out.println("Value is 1"); 
			case 2: 
				System.out.println("Value is 2"); 
			case 3: 
				System.out.println("Value is 3"); 
			default: 
				System.out.println("Default case"); 
		} 
	} 
}
*/
//there is no any break for the cases thats why when any of the case is positive it should break the condition directly from that Point.
//use break to stop the default case.

public class Main22 { 
	public static void main(String[] args) { 
		int value = 2; 
		switch(value) { 
			case 1: 
				System.out.println("Value is 1"); 
				break;
			case 2: 
				System.out.println("Value is 2"); 
				break;
			case 3: 
				System.out.println("Value is 3"); 
				break;
			default: 
				System.out.println("Default case"); 
				break;
		} 
	} 
}