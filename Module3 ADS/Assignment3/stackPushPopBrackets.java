import java.util.Iterator;
import java.util.Scanner;

public class stackPushPopBrackets {
	
	static final int MAX = 100;
	int top;
	char arr[] = new char[MAX];
	
	public stackPushPopBrackets() {
		// TODO Auto-generated constructor stub
		top=-1;
	}
	
	boolean isEmpty() {
		return (top<0);
	}
	
	boolean push(char x) {
		if(top >= (MAX - 1)) {
			System.out.println("Overflow");
			return false;
		}
		else {
			arr[++top] = x;
			return true;
		}
	}
	
	
	char pop() {
		if(top < 0) {
			System.out.println("Underflow");
			return '\0';
		}
		else {
			return arr[top--];
		}	
	}
	
	boolean isMatchingPairs(char char1, char char2) {
		return(char1 == '(' && char2 == ')') ||
				(char1 == '{' && char2 == '}') ||
				(char1 == '[' && char2 == ']');
	}
	
	
	boolean areBracketsBalanced(String expr) {
		for(int i=0;i<expr.length();i++) {
			char ch = expr.charAt(i);
	
		if (ch == '(' || ch == '[' || ch == '{') {
			push(ch);
		}
		
		else if (ch == ')' || ch == ']' || ch == '}') {
			if (isEmpty() || isMatchingPairs(pop(), ch)) {
				return false;
			}
		}
		}
		return isEmpty();
	}
	
	
	
	
	void display() {
    if(isEmpty()) {
        System.out.println("Stack Empty");
    }
    else {
        System.out.println("Stack elements are : ");
        for (int i = 0; i <= top; i++) {
            System.out.print("[" + arr[i] + "] ");
        }
        System.out.println();
    }
	}
	
	public static void main(String[] args) {
		
		stackPushPopBrackets s = new stackPushPopBrackets();
		Scanner sc = new Scanner(System.in);
		String expr = sc.next(); 
		
		for(int i=0;i<expr.length();i++) {
			char ch = expr.charAt(i);
			if (ch == '(' || ch == '[' || ch == '{') {
				s.push(ch);
			}
			else if (ch == ')' || ch == ']' || ch == '}') {
				char popped  = s.pop();
				if (!s.isMatchingPairs(popped, ch)) {
					System.out.println("The brackets are not balanced.");
					return;
				}
			}
		}
		
		if (s.isEmpty()) {
			System.out.println("The brackets are balanced.");
		}
		else {
			System.out.println("The brackets are not balanced.");
		}
		
	}

}
