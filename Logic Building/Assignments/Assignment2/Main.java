
//Snippet 1


/*public class Main { 
 public void main(String[] args) { 
	System.out.println("Hello, World!"); 
	} 
}
*/

//error - Without static keyword in main method compilation of given code is done but the code will generate the error at the time of code execution/running.
//Main method is not static in class main, please define the main method as 
//public static void main(String args[])

//Correct Code is given as below:

public class Main{ 
 public static void main(String[] args) { 
	System.out.println("Hello, World!"); 
	} 
}