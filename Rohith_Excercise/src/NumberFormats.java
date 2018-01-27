import java.text.NumberFormat;

public class NumberFormats {

	
	public static void main(String[] args) {
		NumberFormat money= NumberFormat.getCurrencyInstance();
		NumberFormat percent = NumberFormat.getPercentInstance();
		
		double intialValue, total, intrestRate;
		intialValue = 100000;
		intrestRate = .15;
		
		total = intialValue + intialValue * intrestRate;
		System.out.println("If i put " + money.format(intialValue) + " in the bank at " +percent.format(intrestRate)+" intrest. Then i will have a total of " + money.format(total));
	}
}
