import java.io.Serializable;

public class OuterThread extends Threaded implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8274129466626527153L;
	
	private double length; 
	
	public void getLength(double l) throws IllegalFastener{
		
		if(  ((l >= 0.5 && l < 6) && l % 0.25 == 0)
		  || ((l >= 6 && l < 11) && l % 0.5 == 0)
		  || ((l >= 11 && l <= 20) && l % 1 == 0)) 
		
		{
			length = l; 
		}
		
		else {
			
			throw new IllegalFastener("Illegal length"); 
		}
	}
	
	public OuterThread(double l, String d, String m, String f, double u, double n) throws IllegalFastener{
		
		super(d, m, f, u, n); 
		getLength(l); 
	}
	
	public String toString() {
		
		return length + " long, " + super.toString(); 
	}
}
