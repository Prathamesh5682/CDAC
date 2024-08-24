public class OffByOneDoWhileLoop { 
 public static void main(String[] args) { 
 int num = 1; 
 do { 
 System.out.println(num); 
 num++; 
 } while (num < 6); 
 } 
}

/*
1.Did not get the expected output because num is set to 1 where in do while loop num-- is used where it decrements the value of num
which gets value from 1 to 0 which will never prints the expected value.
so to get as expected value you can make num++ in do while loop and change the condition from num>0 to num<6.
 
*/