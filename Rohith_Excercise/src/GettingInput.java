import java.util.Scanner;

public class GettingInput {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Hey! Where do you live?");
		//input.nextLine();
		String location = input.next();
		System.out.println("It's a wonderful place, I've been in " +location+ " once.");
		
		Scanner inputNum = new Scanner(System.in);
		System.out.println("Whats your favourite number?");
		int number = inputNum.nextInt();
		System.out.println(number + ", Cool number man!!!");
		input.close();
		inputNum.close();
	}
}
