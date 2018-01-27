
public class ReadingFile1 {

	private int id;
	private String name;
	
	ReadingFile1(int id, String name){
		this.id=id;
		this.name=name;
	}

	public String toString() {
		String output = "The id is "+id+", The name is " +name;
		return output;
	}
		
}
