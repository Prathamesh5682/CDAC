public class Main4 { 
    public static void main(String[] args) { 
        System.out.println("Main method with String[] args");    
		} 
	public static void main(int[] args) { 
        System.out.println("Overloaded main method with int[] args");     
		} 
} 

/*
The multiple main methods are possible if the parameters are different in both the main methods.
If the write the main method as same parameters in both of main method then it will surely gives the errors
As per the given snippet there are different parameters in both of main function but only single of string[] args is generating output and int[] args is not giving any output.
*/