class goodMorn{
	public static void main(String args[]){
		LocalTime predefined = LocalTime.of(8,30);

		LocalTime morningStart = LocalTime.of(5, 0);
		LocalTime morningStart = LocalTime.of(12, 0);

		if(!predefinedTime.isBefore(morningStart) && predefinedTime.isBefore(morningEnd)){
			System.out.println("Good Morning");}
		else{
			System.out.println("   ");
		}
	}
}