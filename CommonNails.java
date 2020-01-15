import java.io.Serializable; 

public class CommonNails extends Nail implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3863960105091874522L;

	@Override
	public void getFinish(String finish) throws IllegalFastener{
		
	if(!finish.equals("Bright") && !finish.equals("Hot Dipped Galvanized")) {
				
		throw new IllegalFastener("Illegal finish for Steele"); 
	}
		
	}
	public CommonNails(String s, double l, double g, String f, double d, double n) throws IllegalFastener{
		
		super(s, g, l, f, d, n); 
		
	}
	
	public String toString() {
		
		return "Common Nails " + super.toString(); 
	}
}
