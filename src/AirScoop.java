package carcraft;

public class AirScoop extends CarOptions {

	public String AirScoop;

	public AirScoop(){
		System.out.println("AirScoop Constructor\n");
		AirScoop = "Air Scoop";

	}

	@Override
	public String GetDescription() {
		return super.GetDescription() + " with " + AirScoop;
	}

}