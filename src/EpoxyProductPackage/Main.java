package EpoxyProductPackage; 


public class Main {

	
	public static void main(String[] args) {
	// Main programming logic goes here
	EpoxyProduct ep = new EpoxyProduct(2.0, SIZE.SMALL, BEL.NONE, AEL.NONE, GLOW.NONE);
	ep.printEpoxyProductInfo();
	return;
	
	}
	/*class EpoxyProduct {
		
	public double weight; // in fluid ounces (fl oz)
	
		
	public enum Size {
	    TINY, SMALL, MEDIUM, LARGE, HUGE;
	}
	
	public enum BEL {
		HARDLY, LITTLE, MEDIUM, LOTS, TONS;
	}
	
	public enum AEL {
		HARDLY, LITTLE, MEDIUM, LOTS, TONS;
	}
	
	public enum Glow {
		LITTLE, MEDIUM, LOTS;
	}*/
		
/*				- Size (enum) - [Tiny, Small, Medium, Large, Huge]   // Factors into amount of epoxy base solution needed, general (batch quantities)
				- Weight - How much item weighs overall   // Factors into amount of epoxy base solution needed, accurate (individual)
				- Basic Effect Level (enum) - [Hardly Any [1], Little [2], Medium [3], Lot [4], Tons [5]]
				- Advanced Effect Level (enum) - [Hardly Any [1], Little [2], Medium [3], Lot [4], Tons [5]]
				- Glow Level (enum) - [Little [1], Medium [2], Lot [3]]
				- Extras (Map (Object, Price)) - Static cost add-on determined using component as a key and price as a value
	
	}*/
	
	
}
