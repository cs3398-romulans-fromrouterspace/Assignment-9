
package carcraft;

public class SportWheels extends CarOptions {

	public String SportWheels;

	public SportWheels() {
		System.out.println(" SportWheels Constructor\n");
		SportWheels = "SportWheels";
	}

	@Override
	public String GetDescription() {
		return super.GetDescription() + " with" + SportWheels;
	}
}