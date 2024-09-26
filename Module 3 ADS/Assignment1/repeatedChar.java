class repeatedChar{
	
	static int findRepeats(String str, int index){
		
		if(index >= str.length()){
			return index;
		}
		
		char currentChar = str.charAt(index);
		int count = 0;
		
		for(int i=index+1; i<str.length(); i++){
			if(str.charAt(i) == currentChar){
				count++;
			}
		}
		
		if(count > 0){
			System.out.println(currentChar+" is repeated "+ (count + 1) +" times.");
		}
		return findRepeats(str, index + 1);
	}
	
	public static void main(String args[]){
		String str = "abcdbb";
		findRepeats(str, 0);
	}
}