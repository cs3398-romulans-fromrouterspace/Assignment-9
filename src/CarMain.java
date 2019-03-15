
package carcraft;


public class CarMain {

	public static void main(String[] args) {

		System.out.println("\n--------------------------------------------------------------------------------------");
		System.out.println("WELCOME TO THE CAR-BERNATOR 2000");
		System.out.println("Initiating automated car manufacturing plant...");
		System.out.println("Androids booted.");

		System.out.println("\nMake a base model.");
		ICar cheapCar = new BasicCar();
		System.out.println("\tDone.  Here is your car:");
		System.out.println("\t" + cheapCar.GetDescription());

		System.out.println("\nMake a supercharged car.");
		ICar carMod = new SuperCharger(new BasicCar());
		System.out.println("\tDone. Here is your car: ");
		System.out.println("\t" + carMod.GetDescription());

		System.out.println("\nMake a painted, supercharged car.");
		ICar fancyCar = new paintColor(new SuperCharger(new BasicCar()));
		System.out.println("\tDone.  Here is your car: ");
		System.out.println("\t" + fancyCar.GetDescription());

		System.out.println("\nMake a airscooped, sports-wheeled car.");
		fancyCar = new BasicCar();
		fancyCar = new SportWheels(new AirScoop(fancyCar));
		System.out.println("\tDone.  Here is your car: ");
		System.out.println("\t" + fancyCar.GetDescription());	

		System.out.println("\nMake a car with EVERYTHING.");
		fancyCar = new BasicCar();
		fancyCar = new SuperCharger(new SportWheels(new paintColor(new AirScoop(fancyCar))));
		System.out.println("\tDone.  Here is your car: ");
		System.out.println("\t" + fancyCar.GetDescription());

	System.out.println("\n--------------------------------------------------------------------------------------\n");
	}

}
