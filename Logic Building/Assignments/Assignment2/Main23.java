/*public class Main23 { 
	public static void main(String[] args) { 
		int level = 1; 
		switch(level) { 
			case 1: 
			System.out.println("Level 1"); 
			case 2: 
			System.out.println("Level 2"); 
			case 3: 
			System.out.println("Level 3"); 
			default: 
			System.out.println("Unknown level"); 
		} 
	} 
}
*/
//There is no any break statement.
//If there is no any break statement all cases will by defaultly print all the sop statments.


public class Main23 { 
	public static void main(String[] args) { 
		int level = 1; 
		switch(level) { 
			case 1: 
			System.out.println("Level 1"); 
			break;
			
			case 2: 
			System.out.println("Level 2"); 
			break;
			
			case 3: 
			System.out.println("Level 3"); 
			break;
			
			default: 
			System.out.println("Unknown level"); 
			break;
		} 
	} 
}