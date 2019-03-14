
package carcraft;


public class CarMain {

	public static void main(String[] args) {

		System.out.println("Starting:  Creating Cars without Decorator Pattern\n");

		System.out.println("Make a Supercharged Car:");
		ICar SuperCharger = new SuperCharger();
		System.out.println("Done. Here is your car: " + SuperCharger.GetDescription());

		System.out.println("\nMake a Painted Car:");
		ICar paintColor = new paintColor();
		System.out.println("Done. Here is your car: " + paintColor.GetDescription());

		System.out.println("\nMake a with Sports Wheels:");
		ICar SportsWheels = new SportWheels();
		System.out.println("Done. Here is your car: " + SportsWheels.GetDescription());

		System.out.println("\nMake a with a Air Scoop:");
		ICar AirScoop = new AirScoop();
		System.out.println("Done. Here is your car: " + AirScoop.GetDescription());

		System.out.println("\nMake a basic car:");
		ICar BasicCar = new BasicCar();
		System.out.println("Done. Here is your car: " + BasicCar.GetDescription());

		System.out.println("\nMake a basic car with options");
		ICar CarOptions = new CarOptions();
		System.out.println("Done. Here is your car: " + CarOptions.GetDescription());
	}

}
