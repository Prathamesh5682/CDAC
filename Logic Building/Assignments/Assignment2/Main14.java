public class Main14 { 
	public static void main(String[] args){ 
	int num1 = 10; 
	double num2 = 5.5; 
	int result = num1 + num2; 
	System.out.println(result); 
	} 
}

/*
1.incompatible types: possible lossy conversion from double to int
2.In this code num1 is int and num2 is double so to store the sum of num1 and num2 is in result which is int which not possible 
to store the double because the size of int is 4bytes and double is of 8bytes.So it is not possible to store double in int but
you can store int in double.
*/