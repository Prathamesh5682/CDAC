public class MisplacedForLoopBody { 
	public static void main(String[] args) { 
	for (int i = 0; i < 5; i++){ 
		System.out.println(i); 
		System.out.println("Done"); 
		}
	} 
}
/*
1.Done print once because it is not inside the loop inside the loop braces then it will print after the complete of the loop only.
2.Both the Sop statements should be inside the loop braces thein it will works proplery as upto i know.
*/