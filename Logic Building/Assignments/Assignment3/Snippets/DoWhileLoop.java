public class DoWhileLoop { 
	public static void main(String[] args) { 
		int i = 1; 
		do { 
			System.out.print(i + " "); 
			i++; 
		} while (i < 5); 
		System.out.println(i); 
	} 
}

/*
	i=1
	Sop will print 1 then i++ means i=i+1 
	so i=1+1=2
	while loop condition checks i<5 means 2<5 Yes true

	i=2
	Sop will print 2 then i++ means i=i+1
	so i=2+1=3
	while loop condition checks i<5 means 3<5 Yes true
	
	i=3
	Sop will print 3 then i++ means i=i+1 
	so i=3+1=4
	while loop condition checks i<5 means 4<5 Yes true

	i=5
	Sop will print 5 then i++ means i=i+1
	so i=4+1=5
	while loop condition checks i<5 means 5<5 No False loop will stop there only and 
	output will be 1 2 3 4 5
	
*/