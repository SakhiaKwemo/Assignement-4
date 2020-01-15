import java.io.Serializable;

public class Screw extends OuterThread implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7973339512506725916L;
	
	private String head; 
	private String drive; 
	
	@Override 
	public void getFinish(String finish) throws IllegalFastener{
		
		if(material.equals("Steel") && (finish.equals("Black Phosphate") || finish.equals("ACQ 1000 Hour")
		  || finish.equals("Lubricated")))
			{
			
		}
		
		else {
			
			super.getFinish(finish);
		}
	}
	
	
	public void getHead(String h) throws IllegalFastener{
		
		if(h.equals("Bugle") || h.equals("Flat") || h.equals("Oval") || h.equals("Pan") || h.equals("Round")) {
			
			head = h; 
		}
		
		else {
			
			throw new IllegalFastener("Illegal head"); 
		}
	}
	
	public void getDrive(String dr) throws IllegalFastener{
		
		if(dr.equals("6-Lobe") || dr.equals("Philips") || dr.equals("Slotted") || dr.equals("Square")) {
			
			drive = dr; 
		}
		
		else {
			
			throw new IllegalFastener("Illegal drive"); 
		}
	}
		
	public Screw(double l, String d, String m, String f, String h, String dr, double u, double n) throws IllegalFastener{
		
		super(l, d, m, f, u, n); 
		getHead(h); 
		getDrive(dr); 
	}
	
	public String toString() {
		
		return head+ " head, " +drive+ "drive" + super.toString();
	}
}
