import java.util.Scanner;


class palindrome{
	
	static boolean isPalindrome(String str){
		int left=0;
		int right = str.length() - 1;
		
		while(left < right){
			if(str.charAt(left) != str.charAt(right)){
				return false;
			}
			
			left++;
			right--;
		}
		
		return true;
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter string : ");
		String str = sc.nextLine();
		
		
		if(isPalindrome(str)){
			System.out.println("Is Palindrome");
		}
		else{
			System.out.println("Not at Palindrome");
		}
		
		sc.close();
		
	
	}
}