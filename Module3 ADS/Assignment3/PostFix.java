public class PostFix {
	
	static int postFix(String exp) {
		
		int stack[] = new int[100];
		int top=-1;
		
		String[] tokens = exp.split(" ");
		
		for(int i=0;i<tokens.length;i++) {
			String token = tokens[i];
			if(isNumeric(token)) {
				stack[++top] = Integer.parseInt(token);
			}
			else {
				int operand1 = stack[top--];
				int operand2 = stack[top--];
				
				switch (token) {
				case "+":
					stack[++top] = operand1 + operand2;
					break;
					
				case "-":
					stack[++top] = operand1 - operand2;
					break;
					
				case "*":
					stack[++top] = operand1 * operand2;
					break;
					
				case "/":
					stack[++top] = operand2 / operand1;
					break;
					
				default:
					throw new IllegalArgumentException("Invalid operator : "+token);
				}
			}
		}
		
		return stack[top];
	}
	
	private static boolean isNumeric(String str) {
		try {
			Integer.parseInt(str);
			return true;
		}
		catch(NumberFormatException e) {
			return false;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String exp1  = "5 3 + 2 *";
		System.out.println("Output of Expression : "+postFix(exp1));
		
		String exp2  = "4 5 * 6 /";
		System.out.println("Output of Expression : "+postFix(exp2));
		
		
	}

}