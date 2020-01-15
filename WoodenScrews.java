import java.io.Serializable; 

public class WoodScrews extends Screw implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3959807428889313350L;
	private String point; 
	
	public void getPoint(String p) throws IllegalFastener{
		
		if(p.equals("Double") || p.equals("Cut") || p.equals("Sharp") || p.equals("Type 17")) {
			
			point = p; 
		}
		
		else {
			
			throw new IllegalFastener("Illegal Points"); 
		}
	}
	
	public WoodScrews(double l, String d, String m, String f, String h, String dr, String p, double u, double n) throws IllegalFastener{
		
		super(l, d, m, f, h, dr, u, n);
		getPoint(p); 
	}
	
	public String toString() {
		return "Wood Screw, " +point+ " point, "  +super.toString(); 
	}
}
