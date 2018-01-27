package examples.conditionals;

public class IfElseLoop {

	public static void main(String[] args) {
		int x=5;
		int y=10;
		int z;
		int count = 10;
		int countNum = 10;
		if(x<y) {
			System.out.println("X is less than Y");
		} else {
			System.out.println("X is not less than Y");
		}
		if (x ==5) {
			z=count++;
			System.out.println("count is " + z);
		} else {
			count--;
			System.out.println("count is " + count--);
		}
		if (x ==5) {
			z =0;
			z =++countNum;
			System.out.println("countNum is " + z);
		} else {
			--countNum;
			System.out.println("countNum is " + --countNum);
		}

	}

}
