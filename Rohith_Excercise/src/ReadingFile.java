import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadingFile {

	public static void main(String[] args) throws FileNotFoundException {
		String filepath = "C:\\Users\\e050738\\Workspaces\\Backend-TFC\\Rohith_Excercise\\text.txt";
		File file= new File(filepath);
		Scanner input = new Scanner(file);
		ArrayList<ReadingFile1> list= new ArrayList<ReadingFile1>();
		
//		while(input.hasNext()) {
//			String value = input.nextLine();
//			System.out.println(value);
//		}
		
		while (input.hasNext()) {
			int id =input.nextInt();
			String name =input.next();
			list.add(new ReadingFile1(id,name));
			
		}
		
		for(ReadingFile1 r: list) {
			System.out.println(r);
		}
		
		
		input.close();
	}
}
