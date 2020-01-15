import java.io.Serializable; 

public class CarriageBolt extends Bolt implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3215138675665165214L;

	public CarriageBolt(double l, String d, String m, String f, double e, double n) throws IllegalFastener{
		
		super(l, d, m, f, e, n);
		
	}
	
	public String toString() {
		
		return super.toString(); 
	}
}
