import java.text.NumberFormat;
import java.util.Scanner;

/*Create an application that takes in 3 values from the user.

deposit amount
annual interest rate
time (years)
You will need to ask user for these values (hint: user Scanner to get the user input) and 
then print out to the screen how much money in total will you have after the inputted time. 
You should also format your output so it displays as currency (ex: $2000.00)

Helpful hints:

Think about what data type each 3 values will need
Think of the mathematical logic behind how interest is accrued.
And since we havent gone over loops yet, just find the interest from the initial deposit and multiply by years
If you want to challenge yourself, you can use the interest that builds up after one year, 
add that to total amount of money and find interest on that and so on, so it builds like it does in real life.
*/

public class Assignment1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the amount to be deposited: ");
		int depositAmount= input.nextInt();
		
		System.out.println("Enter the annual interest rate: ");
		float intrestRate = input.nextInt();
		
		System.out.println("Enter the no of years the amount is to be deposited: ");
		int years = input.nextInt();
		
		NumberFormat money= NumberFormat.getCurrencyInstance();
		//NumberFormat percent = NumberFormat.getPercentInstance();
		
		double intialValue, totalAmount = 0;
		float total;
		intialValue= depositAmount;

		float totalInterest = (float) (((float)intialValue/100) * intrestRate);
		
		total = (totalInterest * years);
		totalAmount = intialValue + total;
		System.out.println("The total amount for " + years + " years is " + money.format(totalAmount) + " with a intrest rate of " + intrestRate + "%. At a initial amount of " + money.format(intialValue));
		
		input.close();
	}
}
