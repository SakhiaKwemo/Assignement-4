import java.io.Serializable;

public class Nail extends Fastener implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3065883423498644614L;
	
	private double gauge; 
	private double length;
	private String size;
	private String material = "Steele"; 
	
	public void getSize(String s) throws IllegalFastener{
		
		if(s == "6D" || s == "8D" || s == "10D" || s == "12D" || s == "16D" || s == "60D") {
			
			size = s; 
		}
		
		else {
			
			throw new IllegalFastener(); 
		}
	}
	
	public void getLength(double l) throws IllegalFastener{
		
		if(l == 2 || l == 2.5 || l == 3 || l == 3.25 || l == 3.5 || l == 6) {
			
			length = l; 
		}
		
		else {
			
			throw new IllegalFastener(); 
		}
	}
	
	public void getGauge(double g) throws IllegalFastener{
		
		if(g == 2 || g == 8 || g == 9 || g == 10.25 || g == 11.5) {
			
			gauge = g; 
		}
		
		else {
			
			throw new IllegalFastener(); 
		}
	}
	
	public Nail(String s, double g, double l, String f, double u, double n) throws IllegalFastener{
		
		super("Steel", f, u, n); 
		getSize(s);  
		getLength(l); 
		getGauge(g); 
	}
	
	public String toString() {
		return size+ " size, " +length+ " long, " +gauge+ " gauge, " + super.toString(); 
	}
}
