package EpoxyProductPackage;

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

	public EpoxyProduct(double weight, SIZE s, BEL basicEffect, AEL advancedEffect, GLOW g) {
		super();
		Weight = weight;
		this.s = s;
		this.basicEffect = basicEffect;
		this.advancedEffect = advancedEffect;
		this.g = g;
	}

	public EpoxyProduct(double weight) {
		super();
		Weight = weight;
	}

	/*
	 * - Size (enum) - [Tiny, Small, Medium, Large, Huge] // Factors into amount of
	 * epoxy base solution needed, general (batch quantities) - Weight - How much
	 * item weighs overall // Factors into amount of epoxy base solution
	 * needed,accurate (individual) - Basic Effect Level (enum) - [None [0], Hardly
	 * Any [1], Little[2], Medium [3], Lot [4], Tons [5]] - Advanced Effect Level
	 * (enum) - [None [0]< Hardly Any [1], Little [2], Medium [3], Lot [4], Tons
	 * [5]] - Glow Level (enum) - [None [0], Little [1], Medium [2], Lot [3]] -
	 * Extras (Map (Object, Price)) - Static cost add-on determined using component
	 * as a key and price as a value //TODO
	 */

	/*
	 * public EpoxyProduct (double weight) { // constructor with just weight Weight
	 * = weight; s = SIZE.SMALL; basicEffect = BEL.NONE; advancedEffect = AEL.NONE;
	 * g = GLOW.NONE; }
	 */

	public void printEpoxyProductInfo() {
		System.out.println(); // format
		System.out.println("********************"); // format
		System.out.println(this.Weight);
		System.out.println(this.s);
		System.out.println(this.basicEffect);
		System.out.println(this.advancedEffect);
		System.out.println(this.g);
		System.out.println("********************"); // format
		System.out.println(); // format
	}

	@Override
	public String toString() {
		return "EpoxyProduct [Weight=" + Weight + ", s=" + s + ", basicEffect=" + basicEffect + ", advancedEffect="
				+ advancedEffect + ", g=" + g + "]";
	}

	public double getWeight() {
		return Weight;
	}

	public void setWeight(double weight) {
		Weight = weight;
	}

	public SIZE getS() {
		return s;
	}

	public void setS(SIZE s) {
		this.s = s;
	}

	public BEL getBasicEffect() {
		return basicEffect;
	}

	public void setBasicEffect(BEL basicEffect) {
		this.basicEffect = basicEffect;
	}

	public AEL getAdvancedEffect() {
		return advancedEffect;
	}

	public void setAdvancedEffect(AEL advancedEffect) {
		this.advancedEffect = advancedEffect;
	}

	public GLOW getG() {
		return g;
	}

	public void setG(GLOW g) {
		this.g = g;
	}

}
