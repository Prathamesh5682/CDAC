public class stackPushPop {
	
	static final int MAX = 100;
	int top;
	int arr[] = new int[MAX];
	
	public stackPushPop() {
		// TODO Auto-generated constructor stub
		top=-1;
	}
	
	boolean isEmpty() {
		return (top<0);
	}
	
	boolean push(int x) {
		if(top >= (MAX - 1)) {
			System.out.println("Overflow");
			return false;
		}
		else {
			arr[++top] = x;
			return true;
		}
	}
	
	
	int pop() {
		if(top < 0) {
			System.out.println("Underflow");
			return -1;
		}
		else {
			return arr[top--];
		}	
	}
	
	void display() {
		if(isEmpty()) {
			System.out.println("Stack Empty");
		}
		else {
			System.out.println("Stack elements are : ");
			show(top);
			System.out.println();
		}
	}
	
	void show(int index) {
		
		if(index < 0) {
			return;
		}
		else {
			show(index - 1);
			System.out.print("["+arr[index]+"]");
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stackPushPop s1 = new stackPushPop();
		s1.push(5);
		s1.push(3);
		s1.push(7);
		
		s1.display();
		
		//System.out.println();
		
		s1.pop();
		s1.display();
		
	}

}
