
package carcraft;

public class SuperCharger extends CarOptions
{
        public SuperCharger(ICar carMod)
        {
            super(carMod);
        }

        public String GetDescription()
        {
            return carMod.GetDescription() + " -> supercharger";
        }
}
