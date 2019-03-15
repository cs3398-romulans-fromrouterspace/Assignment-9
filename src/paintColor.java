
package carcraft;

public class paintColor extends CarOptions
{
        public paintColor(ICar carMod)
        {
           super(carMod);
        }

        public String GetDescription()
        {
            return carMod.GetDescription() + " -> whatever color makes you happy";
        }
}
