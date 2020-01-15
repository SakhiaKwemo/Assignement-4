import java.io.Serializable; 

public class InnerThread extends Threaded implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7679631883464081346L;

	public InnerThread(String d, String m, String f, double u, double n) throws IllegalFastener{
		
		super(d, m, f, u, n); 
	}
	
	public String toString() {
		
		return super.toString(); 
	}
}
