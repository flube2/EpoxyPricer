
enum GLOW {
	NONE, LITTLE, MEDIUM, LOTS;
}
enum SIZE {
	TINY, SMALL, MEDIUM, LARGE, HUGE;
}

enum BEL {
	NONE, HARDLY, LITTLE, MEDIUM, LOTS, TONS;
}

enum AEL {
	NONE, HARDLY, LITTLE, MEDIUM, LOTS, TONS;
}


public class EpoxyProduct {

	public double Weight; // in fluid ounces (fl oz)
	public SIZE s;
	public BEL basicEffect;
	public AEL advancedEffect;
	public GLOW g;


	/*
	 * - Size (enum) - [Tiny, Small, Medium, Large, Huge] // Factors into amount of epoxy base solution needed, general (batch quantities) 
	 * - Weight - How much item weighs overall // Factors into amount of epoxy base solution needed,accurate (individual) 
	 * - Basic Effect Level (enum) - [None [0], Hardly Any [1], Little[2], Medium [3], Lot [4], Tons [5]] 
	 * - Advanced Effect Level (enum) - [None [0]< Hardly Any [1], Little [2], Medium [3], Lot [4], Tons [5]] 
	 * - Glow Level (enum) - [None [0], Little [1], Medium [2], Lot [3]] 
****** - Extras (Map (Object, Price)) - Static cost add-on determined using component as a key and price as a value  //TODO
	 */

	public EpoxyProduct (double weight) { // constructor with just weight
		Weight = weight;
		s = SIZE.SMALL;
		basicEffect = BEL.NONE;
		advancedEffect = AEL.NONE;
		g = GLOW.NONE;
	}

	public void printEpoxyProductInfo() {
	System.out.println();	// format
	System.out.println("********************");	// format	
	System.out.println(Weight);	
	System.out.println(s);	
	System.out.println(basicEffect);
	System.out.println(advancedEffect);
	System.out.println(g);	
	System.out.println("********************");	// format	
	System.out.println();	// format
	}
	
	
}
