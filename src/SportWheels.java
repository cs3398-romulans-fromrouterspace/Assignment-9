
package carcraft;

public class SportWheels extends CarOptions {

	public SportWheels(ICar carMod){
		super(carMod);
	}

	public String GetDescription() {
		return carMod.GetDescription() + " -> sportswheels";
	}
}