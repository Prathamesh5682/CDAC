class nonRepeatedChar{
	
	
	static void nonRepeat(String str, int index){
		
		//base case
		if(index >= str.length()){
			return;
		}
		
		char currentChar = str.charAt(index);
		boolean isRepeated = false;
		
		for(int i=0;i<str.length();i++){
			if(i != index && str.charAt(i) == currentChar){
				isRepeated = true;
				break;
			}
		}
		
		if(!isRepeated){
			System.out.print(currentChar + " ");
		}
		
		nonRepeat(str, index + 1);
	}
	
	public static void main(String args[]){
		String str = "abbababcdef";
		System.out.print("Non repeated characters are : ");
		nonRepeat(str,0);		
	}
}