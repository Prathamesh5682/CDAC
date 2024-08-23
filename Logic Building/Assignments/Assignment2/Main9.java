public class Main9{
	public void display(String args[]){
		System.out.println("No Parameters");
	}
	public void display (int num){
		System.out.println("With Parameter : "+num);
	}
	public static void main(String args[]){
		display();
		display(5);
	}
}

/*
1.Display methods are non-static methods.Display is not static this will leds to compilation error.
2.non-static methods are cannot be referenced from a static context.
*/