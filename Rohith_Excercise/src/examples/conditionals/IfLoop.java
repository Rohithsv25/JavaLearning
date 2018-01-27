package examples.conditionals;

public class IfLoop {

	public static void main(String[] args) {
		int x=5;
		int y=10;
		int z=5;
		
		if(x<y) {
			System.out.println("X is less than Y");
		}
		if(x==z) {
			System.out.println("X is equal to Z");
		}
		if(y>x) {
			System.out.println("Y is greater than X");
		}
		if((x<y) && (x==z)) {
			System.out.println("X is less than Y and X is equal to Z");
		}
	}
}
