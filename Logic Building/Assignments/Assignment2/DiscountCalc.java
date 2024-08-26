import java.util.*;


public class DiscountCalc{
	public static void main(String args[]){
		System.out.println("Enter the ShopAmount:");
		Scanner  sc = new Scanner(System.in);
		double shopAmt = sc.nextDouble();
		
		System.out.println("Do u have the membership card??");
		String membership = sc.next();
		
		boolean HasMembership = membership.equalsIgnoreCase("no");
		
		
		double discount = 0;
		if(shopAmt >= 1000){
			discount = 20;
		}else if(shopAmt>= 500 && shopAmt<= 999){
			discount = 10;
		}else if(shopAmt< 500){
			discount = 5;
		}
		
		if(HasMembership){
			discount= discount + 5;
		}
		
		double discountAmt = (shopAmt / 100) * discount;
		double finalPrice = shopAmt - discountAmt;
		
		System.out.println("The Amount after giving the discount on your Amount is: " + finalPrice);
	}
}
