/*public class Main16 { 
	public static void main(String[] args){ 
	int a = 10; 
	int b = 5; 
	int result = a ** b; 
	System.out.println(result); 
	} 
}
*/
//error: illegal start of expression
//** is not valid because the java does not contain exponentation expression.\

public class Main16 { 
	public static void main(String[] args){ 
	int a = 10; 
	int b = 5; 
	double result = Math.pow(a,b); 
	System.out.println(result); 
	} 
}