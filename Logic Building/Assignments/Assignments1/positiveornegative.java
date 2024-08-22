import java.util.*;

class Positive_Negative{
	public static void main(String args[])
	{	
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n>=0)
		{
			System.out.println("The given number is positive");
		}
		else
		{
			System.out.println("The given number is negative");
		}
	}
}