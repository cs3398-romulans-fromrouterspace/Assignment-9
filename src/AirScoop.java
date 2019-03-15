package carcraft;

public class AirScoop extends CarOptions{

	public AirScoop(ICar carMod){
		super(carMod);
	}

	public String GetDescription() {
		return carMod.GetDescription() + " -> airscoop";
	}
}