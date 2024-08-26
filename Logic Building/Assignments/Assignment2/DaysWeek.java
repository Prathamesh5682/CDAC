import java.util.*;


public DaysWeek{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int day = sc.nextInt();
		
		switch(day)
		{
			case 1:
				System.out.println("Monday");
				switch(day)
				{
					case 1:
						System.out.println("It is weekday");
						break;
				}
				break;
			
			case 2:
				System.out.println("Tuesday");
				switch(day)
				{
					case 2:
						System.out.println("It is weekday");
						break;
				}
				break;
	
			case 3:
				System.out.println("Wednesday");
				switch(day)
				{
					case 3:
						System.out.println("It is weekday");
						break;
				}
				break;

			case 4:
				System.out.println("Thursday");
				switch(day)
				{
					case 4:
						System.out.println("It is weekday");
						break;
				}
				break;
				
			case 5:
				System.out.println("Friday");
				switch(day)
				{
					case 5:
						System.out.println("It is weekday");
						break;
				}
				break;

			case 6:
				System.out.println("Saturday");
				switch(day)
				{
					case 6:
						System.out.println("It is weekend");
						break;
				}
				break;

			case 7:
				System.out.println("Sunday");
				switch(day)
				{
					case 7:
						System.out.println("It is weekend");
						break;
				}
				break;
			
			default :
				System.out.println("Wrong entry");
				break;
		}
	}
}