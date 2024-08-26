/*public class Main5 { 
    public static void main(String[] args) { 
		int x = y + 10;
        System.out.println(x);    
	}
}
*/
/* 
As i compile the code then it gives the error message of as y cannot be found because we have not declared the y.
Declaration of variables is important because the without decalaration it cannot work beacuse it will genearte the error message and that the computer should need to know about the datatype of y such int, float etc.
so variables should be declared properly and values also should be initialized properly*/

//Proper way to initialization and decalaration can be given below

public class Main5{
	public static void main(String[] args){
		int x, y=5;
		x = y+10;
		System.out.println(x);
	}
}