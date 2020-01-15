import java.io.Serializable;  

public class Threaded extends Fastener implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7864795041827752292L;
	private String diameter;
	
	public void getDiameter(String d) throws IllegalFastener {
		
		if(d.equals("#8-13") || d.equals("#8-15") || d.equals("#8-32") || d.equals("#10-13") || 
		   d.equals("#10-24") || d.equals("#10-32") || d.equals("1/4-20") || d.equals("5/16-18") || 
		   d.equals("3/8-16") || d.equals("7/16-14") || d.equals("1/2-13") || d.equals("5/8-11") || 
		   d.equals("3/4-10")) {
			
			diameter = d; 
		}
		
		else {
			
			throw new IllegalFastener("Illegal Diameter"); 
		}
	}
	
	public Threaded(String d, String m, String f, double u, double n) throws IllegalFastener {
		
		super(m, f, u, n); 
		getDiameter(d); 
	}
	
	public String toString() {
	
		return diameter+ "thread, " + super.toString(); 
	}
}
