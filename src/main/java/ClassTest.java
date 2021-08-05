
public class ClassTest {
    
	private int number = 1;
	private String word = "toto";
	
	private String concat() {
		return number + word;
	}
	
	public String getConcat() {
		return concat();
	}
	
}
