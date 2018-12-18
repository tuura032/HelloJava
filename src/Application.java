import java.math.BigDecimal;

public class Application {

	public static void main(String[] args) {
		
		// Part 2
		double Kerrygold = 2.99;
		double cashInWallet = 45.26;
		int friendNum = 54;
		int age = 27;
		String firstName = "Paul";
		String lastName = "Tuura";
		String middleInitial = "P";
		
		// Part 3
		double afterShopping = cashInWallet - Kerrygold;
		float friendsPerYear = friendNum / age;
		String fullName = firstName + " " + middleInitial + " " + lastName;
		
		// Fix money
		BigDecimal actualCurrency = new BigDecimal(afterShopping).setScale(2, BigDecimal.ROUND_HALF_UP);
		
		// Part 4
		System.out.println("I have $" + cashInWallet + " in my wallet.");
		System.out.println("I like Kerrygold butter, it's healthy and only costs $" + Kerrygold);
		System.out.println("I have " + friendNum + " friends!");
		System.out.println("I am " + age + ".");
		System.out.println("My first name is " + firstName + ".");
		System.out.println("My middle initial is " + middleInitial + ".");
		System.out.println("My last name is " + lastName + ".");
		System.out.println("My full name is " + fullName + ".");
		System.out.println("I make approximately " + friendsPerYear + " friends per year.");
		System.out.println("After I buy butter I only have " + afterShopping + " left in my wallet.");
		System.out.println("I couldn't live with myself knowing there was a fractional penny in my wallet, but thanks to "
				+ "Stack Overflow, I now know I have " + actualCurrency + " in my wallet!");
		
		// Hello World
		System.out.println("Hello World!");
	}

}
