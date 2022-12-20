


	 enum Glow {
		NONE, LITTLE, MEDIUM, LOTS;
	}



public class EpoxyProduct {

	public double Weight; // in fluid ounces (fl oz)

	public enum Size {
		TINY, SMALL, MEDIUM, LARGE, HUGE;
	}

	public enum BEL {
		NONE, HARDLY, LITTLE, MEDIUM, LOTS, TONS;
	}

	public enum AEL {
		NONE, HARDLY, LITTLE, MEDIUM, LOTS, TONS;
	}


	/*
	 * - Size (enum) - [Tiny, Small, Medium, Large, Huge] // Factors into amount of
	 * epoxy base solution needed, general (batch quantities) - Weight - How much
	 * item weighs overall // Factors into amount of epoxy base solution needed,
	 * accurate (individual) - Basic Effect Level (enum) - [Hardly Any [1], Little
	 * [2], Medium [3], Lot [4], Tons [5]] - Advanced Effect Level (enum) - [Hardly
	 * Any [1], Little [2], Medium [3], Lot [4], Tons [5]] - Glow Level (enum) -
	 * [Little [1], Medium [2], Lot [3]] - Extras (Map (Object, Price)) - Static
	 * cost add-on determined using component as a key and price as a value
	 */

	public EpoxyProduct (double weight) { // constructor with just weight
		Weight = weight;
		Size = SMALL;
		AEL = NONE;
		BEL = NONE;
		Glow = NONE;
	}
	
	}
	
	
}
