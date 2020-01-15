import java.io.Serializable;

public class Fastener implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8547624654475493863L;
	
	/*private enum material{Brass, StainlessSteele, Steel}; 	
	private enum finishes{Chrome, HotDippedGalvanized, Plain, YellowZinc, Zinc, BlackPhosphate, ACQ1000, Lubricated}; ; 
	
	private material material; 
	private finishes finish; 
	*/
	
	private String finish; 
	public final String material; 
	private double pricePerUnits; 
	private double numberPerUnits; 
	
	public void getFinish(String f) throws IllegalFastener {
		
		if((material.equals("Steel") && (f.equals("Chrome") || f.equals("Hot Dipped Galvanized") || f.equals("Plain") 
				                                 || f.equals("Yellow Zinc") || f.equals("Zinc"))
				
				                                 || 
		   (material.equals("Stainless Steel") && (f.equals("Plain")))))
		{
		
			finish = f; 
		}
		
		else {
			
			throw new IllegalFastener("Illegal finish"); 
		}
	}
	
	public void getUnit(double u) throws IllegalFastener {

		if(u >= 0) {
		 
			pricePerUnits = u; 
		}
		
		else {
			
			throw new IllegalFastener("Illegal unit"); 
		}
	}
	
	
	public void getNumber(double n) throws IllegalFastener {

		if( (n >= 1 && n <= 10000) && ( n % 5 == 0 || n == 1)) {
		 
			numberPerUnits = n; 
		}
		
		else {
			
			throw new IllegalFastener("Illegal number"); 
		}
	}

	
	public Fastener(String m, String f, double u, double n) throws IllegalFastener {
		
		if(!m.equals("Brass") && !m.equals("Stainless Steel") && !m.equals("Steel")) {
			 
			throw new IllegalFastener("Illegal material"); 
		}
	
		material = m; 
		
		getFinish(f); 
		getUnit(u);
		getNumber(n); 
	}
	
	public double getOrderCost(int numberOfUnits) {
		
		return pricePerUnits * numberOfUnits;   
	}
	
	public String toString() {
		
		return material+ ", with a " +finish+ " finish. " +numberPerUnits+ " in a unit, " +pricePerUnits+ "per unit"; 
	}
}
